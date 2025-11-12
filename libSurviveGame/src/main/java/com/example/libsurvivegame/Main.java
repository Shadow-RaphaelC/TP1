package com.example.libsurvivegame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Donner un nom a votre heros");
        String nameHero = read.nextLine();
        System.out.println("Donner un genre au heros [ Homme - Femme ]");
        String genderHero = read.nextLine();

        Heros Gerald = new Heros(nameHero, 4, 20, 3, true, genderHero, 0, 50, 4);

        ArrayList<Monstre> ListeMonstres = new ArrayList<>();

        Zones zone = Zones.VerdantGrove;
        int wave = 1;
        int nbMonstres = 0;
        int coinsObtained;
        int coinsAddUp = 0;
        ShopState state = new ShopState(false, false);

        do {
            switch (wave) {
                case 1:
                    nbMonstres = 3;
                    coinsAddUp = 10;
                    zone = Zones.VerdantGrove;
                    System.out.println("\nNouvelle zone ! Vous etes rendu dans " + Zones.VerdantGrove);
                    System.out.println();
                    state.boughtArmor = false;
                    state.boughtWeapon = false;
                    break;

                case 6:
                    nbMonstres = 3;
                    coinsObtained = 25;
                    Gerald.addCoins(coinsObtained);
                    System.out.println("\nVous avez obtenu " + coinsObtained + " pieces pour avoir atteint la nouvelle zones !");
                    coinsAddUp = 40;
                    zone = Zones.ScorchwindBarrens;
                    System.out.println("\nNouvelle zone ! Vous etes rendu dans " + Zones.ScorchwindBarrens);
                    System.out.println();

                    state.boughtArmor = false;
                    state.boughtWeapon = false;
                    break;

                case 11:
                    nbMonstres = 3;
                    coinsObtained = 45;
                    Gerald.addCoins(coinsObtained);
                    System.out.println("\nVous avez obtenu " + coinsObtained + " pieces pour avoir atteint la nouvelle zones !");
                    coinsAddUp = 50;
                    zone = Zones.EmbercoreCrater;
                    System.out.println("\nNouvelle zone ! Vous etes rendu dans " + Zones.EmbercoreCrater);
                    System.out.println();
                    state.boughtArmor = false;
                    state.boughtWeapon = false;
                    break;

                case 16:
                    nbMonstres = 3;
                    coinsObtained = 50;
                    Gerald.addCoins(coinsObtained);
                    System.out.println("\nVous avez obtenu " + coinsObtained + " pieces pour avoir atteint la nouvelle zones !");
                    coinsAddUp = 60;
                    zone = Zones.ThornecastleRuins;
                    System.out.println("\nNouvelle zone ! Vous etes rendu dans " + Zones.ThornecastleRuins);
                    System.out.println();
                    state.boughtArmor = false;
                    state.boughtWeapon = false;
                    break;
                case 21:
                    zone = Zones.GloomyVoid;
                    System.out.println("\nNouvelle zone ! Vous etes rendu dans " + Zones.GloomyVoid);
                    System.out.println("Apres un long combat, vous revenez victorieux ! Vous vous sentez...... un peu.... fatigue...");
                    System.out.println("Vous vous reveillez, l'air ambient est lourd...");
                    System.out.println("La noirceure est tout ce que l'on peut percevoir");
                    System.out.println("Un aura rode autour de vous.....");
                    System.out.println("Void apparait !");
                    nbMonstres = 1;
            }

            Utilities.GenererMonstres(nbMonstres, zone, ListeMonstres);

            do {
                System.out.println("\nVoici vos propres stats");
                Gerald.afficherEtat();

                int choixCombat = Utilities.CombatMenu(ListeMonstres);
                switch (choixCombat) {
                    case 1:
                        System.out.println("Combien de balles voulez vous utiliser ? [ 0 - " + Gerald.getAmmo() + " ]");
                        int nbAmmoUsed = read.nextInt();

                        if (nbAmmoUsed <= Gerald.getAmmo()) {
                            System.out.println("Vous essayez de tirer sur les ennemis avec " + nbAmmoUsed + " balles");

                            if (Utilities.Chances(100) < Gerald.getHitPercent()) {
                                System.out.println("Vous touchez tout les ennemis");
                                Gerald.useAmmo(nbAmmoUsed);

                                for (int i = 1; i <= nbAmmoUsed && !ListeMonstres.isEmpty(); i++) {
                                    int monstre = Utilities.Chances(ListeMonstres.size());

                                    Gerald.attaquer(ListeMonstres.get(monstre));
                                    if (ListeMonstres.get(monstre).getHealth() <= 0) {
                                        ListeMonstres.get(monstre).setAlive(false);
                                        ListeMonstres.remove(monstre);
                                    }
                                }
                            } else {
                                nbAmmoUsed = (int) Math.floor((float) nbAmmoUsed / 2);
                                Gerald.useAmmo(nbAmmoUsed);

                                System.out.println("Votre arme malfonctionne... Vous utilisez seulement la moitie de vos balles [ " + nbAmmoUsed + " ]");

                                for (int i = 1; i <= nbAmmoUsed && !ListeMonstres.isEmpty(); i++) {
                                    int monstre = Utilities.Chances(ListeMonstres.size());

                                    Gerald.attaquer(ListeMonstres.get(monstre));
                                    if (ListeMonstres.get(monstre).getHealth() <= 0) {
                                        ListeMonstres.get(monstre).setAlive(false);
                                        ListeMonstres.remove(monstre);
                                    }
                                }
                            }
                            if (!ListeMonstres.isEmpty()) {
                                System.out.println("\nC'est le tour des ennemis");
                                int randomChoixEnnemi = Utilities.Chances(ListeMonstres.size());

                                System.out.println("Le monstre #" + randomChoixEnnemi + " attaque le heros");

                                if (ListeMonstres.get(randomChoixEnnemi).isPassive()) {
                                    System.out.println("Le monstre ne veut aucun mal au hero");
                                } else {
                                    if (ListeMonstres.get(randomChoixEnnemi).getAmmo() > 0) {
                                        ListeMonstres.get(randomChoixEnnemi).attaquer(Gerald);
                                        ListeMonstres.get(randomChoixEnnemi).moreAmmo(-1);
                                        System.out.println("Ouch le heros prend un coup de " + ListeMonstres.get(randomChoixEnnemi).getDamage() + " degats sur vos " + Gerald.getHealth() + " HP");
                                        if (Gerald.getHealth() <= 0) {
                                            Gerald.setAlive(false);
                                            System.out.println("Vous ete mort !");
                                            System.exit(0);
                                        }
                                    }
                                    else {
                                        System.out.println("Le monstre ne peut plus utiliser de munitions");
                                    }
                                }
                            }
                        } else {
                            System.out.println("\nVous utiliser un nombre invalide de balles. Round Skip");
                        }
                        break;
                    case 2:
                        System.out.println("Vous abandonnez le combat...");
                        System.out.println("Les monstres triomphent");
                        System.exit(0);
                        break;
                }
            } while (!ListeMonstres.isEmpty());

            System.out.println("\nBravo ! Vous avez vaincu tout les ennemis de cette manche !");
            System.out.println("Vous avez obtenu " + coinsAddUp + " pieces d'or");
            Gerald.addCoins(coinsAddUp);
            nbMonstres++;
            wave++;

            System.out.println("Mid Game Shop !\n");

            Utilities.ShopMenu(zone, Gerald, state);

            if (wave < 20) {
                System.out.println("Vous allez vers la nouvelle manche ! Manche #" + wave + " en chargement\n");
            }
            ListeMonstres.clear();

        } while (wave <= 21);
        System.out.println("C'est fini pour de vrai maitenant, bravo hero, vous avez sauver le monde");
        System.out.println("Le jeu est maintenant fini !");
        read.close();
    }
}
