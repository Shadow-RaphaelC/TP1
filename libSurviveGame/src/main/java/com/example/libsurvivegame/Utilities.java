package com.example.libsurvivegame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utilities {
    public static int Chances(int nb) {
        Random chance = new Random();
        return chance.nextInt(nb);
    }

    public static void GenererMonstres(int nbMonstres, Zones zone, ArrayList<Monstre> ListeMonstres) {
        switch (zone) {
            case VerdantGrove:
                if (nbMonstres == 3) {
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                    ListeMonstres.add(new Monstre("BranchbackTortoise", 4, 1, 1, true, "BranchbackTortoise", true));
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                } else if (nbMonstres == 4) {
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                    ListeMonstres.add(new Monstre("BranchbackTortoise", 4, 1, 1, true, "BranchbackTortoise", true));
                    ListeMonstres.add(new Monstre("BranchbackTortoise", 4, 1, 1, true, "BranchbackTortoise", true));
                    ListeMonstres.add(new Monstre("Twigling", 5, 1, 2, true, "Twigling", false));
                } else if (nbMonstres == 5) {
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                    ListeMonstres.add(new Monstre("BranchbackTortoise", 4, 1, 1, true, "BranchbackTortoise", true));
                    ListeMonstres.add(new Monstre("Twigling", 5, 1, 2, true, "Twigling", false));
                    ListeMonstres.add(new Monstre("MossfangWolf", 6, 1, 2, true, "MossfangWolf", false));
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                } else if (nbMonstres == 6) {
                    ListeMonstres.add(new Monstre("BranchbackTortoise", 4, 1, 1, true, "BranchbackTortoise", true));
                    ListeMonstres.add(new Monstre("Twigling", 5, 1, 2, true, "Twigling", false));
                    ListeMonstres.add(new Monstre("MossfangWolf", 6, 1, 2, true, "MossfangWolf", false));
                    ListeMonstres.add(new Monstre("Twigling", 5, 1, 2, true, "Twigling", false));
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                    ListeMonstres.add(new Monstre("BranchbackTortoise", 4, 1, 1, true, "BranchbackTortoise", true));
                } else if (nbMonstres == 7) {
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                    ListeMonstres.add(new Monstre("Twigling", 5, 1, 2, true, "Twigling", false));
                    ListeMonstres.add(new Monstre("MossfangWolf", 6, 1, 2, true, "MossfangWolf", false));
                    ListeMonstres.add(new Monstre("Twigling", 5, 1, 2, true, "Twigling", false));
                    ListeMonstres.add(new Monstre("BranchbackTortoise", 4, 1, 1, true, "BranchbackTortoise", true));
                    ListeMonstres.add(new Monstre("SnuffleHare", 3, 1, 1, true, "SnuffleHare", true));
                    ListeMonstres.add(new Monstre("MossfangWolf", 6, 1, 2, true, "MossfangWolf", false));
                }
                break;

            case ScorchwindBarrens:
                if (nbMonstres == 3) {
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                    ListeMonstres.add(new Monstre("DustPuffin", 10, 2, 2, true, "DustPuffin", true));
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                } else if (nbMonstres == 4) {
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                    ListeMonstres.add(new Monstre("DustPuffin", 10, 2, 2, true, "DustPuffin", true));
                    ListeMonstres.add(new Monstre("DustPuffin", 10, 2, 2, true, "DustPuffin", true));
                    ListeMonstres.add(new Monstre("SandstingerScorpion", 10, 2, 3, true, "SandstingerScorpion", false));
                } else if (nbMonstres == 5) {
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                    ListeMonstres.add(new Monstre("DustPuffin", 10, 2, 2, true, "DustPuffin", true));
                    ListeMonstres.add(new Monstre("SandstingerScorpion", 10, 2, 3, true, "SandstingerScorpion", false));
                    ListeMonstres.add(new Monstre("DuneRaider", 12, 2, 3, true, "DuneRaider", false));
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                } else if (nbMonstres == 6) {
                    ListeMonstres.add(new Monstre("DustPuffin", 10, 2, 2, true, "DustPuffin", true));
                    ListeMonstres.add(new Monstre("SandstingerScorpion", 10, 2, 3, true, "SandstingerScorpion", false));
                    ListeMonstres.add(new Monstre("DuneRaider", 12, 2, 3, true, "DuneRaider", false));
                    ListeMonstres.add(new Monstre("SandstingerScorpion", 10, 2, 3, true, "SandstingerScorpion", false));
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                    ListeMonstres.add(new Monstre("DustPuffin", 10, 2, 2, true, "DustPuffin", true));
                } else if (nbMonstres == 7) {
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                    ListeMonstres.add(new Monstre("SandstingerScorpion", 10, 2, 3, true, "SandstingerScorpion", false));
                    ListeMonstres.add(new Monstre("DuneRaider", 12, 2, 3, true, "DuneRaider", false));
                    ListeMonstres.add(new Monstre("SandstingerScorpion", 10, 2, 3, true, "SandstingerScorpion", false));
                    ListeMonstres.add(new Monstre("DustPuffin", 10, 2, 2, true, "DustPuffin", true));
                    ListeMonstres.add(new Monstre("CactusCrawler", 8, 1, 2, true, "CactusCrawler", true));
                    ListeMonstres.add(new Monstre("DuneRaider", 12, 2, 3, true, "DuneRaider", false));
                }
                break;

            case EmbercoreCrater:
                if (nbMonstres == 3) {
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                    ListeMonstres.add(new Monstre("HeatMoth", 16, 2, 4, true, "HeatMoth", true));
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                } else if (nbMonstres == 4) {
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                    ListeMonstres.add(new Monstre("HeatMoth", 16, 2, 4, true, "HeatMoth", true));
                    ListeMonstres.add(new Monstre("HeatMoth", 16, 2, 4, true, "HeatMoth", true));
                    ListeMonstres.add(new Monstre("MagmaImp", 18, 3, 5, true, "MagmaImp", false));
                } else if (nbMonstres == 5) {
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                    ListeMonstres.add(new Monstre("HeatMoth", 16, 2, 4, true, "HeatMoth", true));
                    ListeMonstres.add(new Monstre("MagmaImp", 18, 3, 5, true, "MagmaImp", false));
                    ListeMonstres.add(new Monstre("AshDrake", 20, 3, 5, true, "AshDrake", false));
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                } else if (nbMonstres == 6) {
                    ListeMonstres.add(new Monstre("HeatMoth", 16, 2, 4, true, "HeatMoth", true));
                    ListeMonstres.add(new Monstre("MagmaImp", 18, 3, 5, true, "MagmaImp", false));
                    ListeMonstres.add(new Monstre("AshDrake", 20, 3, 5, true, "AshDrake", false));
                    ListeMonstres.add(new Monstre("MagmaImp", 18, 3, 5, true, "MagmaImp", false));
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                    ListeMonstres.add(new Monstre("HeatMoth", 16, 2, 4, true, "HeatMoth", true));
                } else if (nbMonstres == 7) {
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                    ListeMonstres.add(new Monstre("MagmaImp", 18, 3, 5, true, "MagmaImp", false));
                    ListeMonstres.add(new Monstre("AshDrake", 20, 3, 5, true, "AshDrake", false));
                    ListeMonstres.add(new Monstre("MagmaImp", 18, 3, 5, true, "MagmaImp", false));
                    ListeMonstres.add(new Monstre("HeatMoth", 16, 2, 4, true, "HeatMoth", true));
                    ListeMonstres.add(new Monstre("GlowshroomCrab", 14, 2, 3, true, "GlowshroomCrab", true));
                    ListeMonstres.add(new Monstre("AshDrake", 20, 3, 5, true, "AshDrake", false));
                }
                break;

            case ThornecastleRuins:
                if (nbMonstres == 3) {
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                    ListeMonstres.add(new Monstre("DustSprite", 35, 2, 5, true, "DustSprite", true));
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                } else if (nbMonstres == 4) {
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                    ListeMonstres.add(new Monstre("DustSprite", 35, 2, 5, true, "DustSprite", true));
                    ListeMonstres.add(new Monstre("DustSprite", 35, 2, 5, true, "DustSprite", true));
                    ListeMonstres.add(new Monstre("WailingKnight", 45, 3, 6, true, "WailingKnight", false));
                } else if (nbMonstres == 5) {
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                    ListeMonstres.add(new Monstre("DustSprite", 35, 2, 5, true, "DustSprite", true));
                    ListeMonstres.add(new Monstre("WailingKnight", 45, 3, 6, true, "WailingKnight", false));
                    ListeMonstres.add(new Monstre("GargoyleSentinel", 50, 3, 7, true, "GargoyleSentinel", false));
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                } else if (nbMonstres == 6) {
                    ListeMonstres.add(new Monstre("DustSprite", 35, 2, 5, true, "DustSprite", true));
                    ListeMonstres.add(new Monstre("WailingKnight", 45, 3, 6, true, "WailingKnight", false));
                    ListeMonstres.add(new Monstre("GargoyleSentinel", 50, 3, 7, true, "GargoyleSentinel", false));
                    ListeMonstres.add(new Monstre("WailingKnight", 45, 3, 6, true, "WailingKnight", false));
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                    ListeMonstres.add(new Monstre("DustSprite", 35, 2, 5, true, "DustSprite", true));
                } else if (nbMonstres == 7) {
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                    ListeMonstres.add(new Monstre("WailingKnight", 45, 3, 6, true, "WailingKnight", false));
                    ListeMonstres.add(new Monstre("GargoyleSentinel", 50, 3, 7, true, "GargoyleSentinel", false));
                    ListeMonstres.add(new Monstre("WailingKnight", 45, 3, 6, true, "WailingKnight", false));
                    ListeMonstres.add(new Monstre("DustSprite", 35, 2, 5, true, "DustSprite", true));
                    ListeMonstres.add(new Monstre("ShadowRat", 30, 2, 4, true, "ShadowRat", true));
                    ListeMonstres.add(new Monstre("GargoyleSentinel", 50, 3, 7, true, "GargoyleSentinel", false));
                }
                break;
            case GloomyVoid:
                ListeMonstres.add(new Monstre("VoidMinion", 500, 2, 5, true, "VoidMinion", false));
                ListeMonstres.add(new Monstre("VoidMinion", 500, 2, 5, true, "VoidMinion", false));
                ListeMonstres.add(new Monstre("Void", 2500, 5, 20, true, "Void", false));
                ListeMonstres.add(new Monstre("VoidMinion", 500, 2, 5, true, "VoidMinion", false));
                ListeMonstres.add(new Monstre("VoidMinion", 500, 2, 5, true, "VoidMinion", false));
                break;
        }
    }

    public static int CombatMenu(ArrayList<Monstre> ListeMonstre) {
        Scanner read = new Scanner(System.in);
        int choix = 0;

        System.out.println("======================================");
        System.out.println("                    COMBAT MENU                      ");
        System.out.println("======================================");

        do {
            System.out.println("Voici les ennemis presents devant vous\n");
            Utilities.AfficherMonstres(ListeMonstre);

            System.out.println("\nQue souhaitez-vous faire ?");
            System.out.println("1.  Attaquer l'ennemi");
            System.out.println("2.  Abandonner le combat");
            System.out.print("\nEntrez votre choix (1 ou 2) : ");
            choix = read.nextInt();

            if (choix < 1 || choix > 2) {
                System.out.println("Veuillez entrer un nombre valide [ 1 - 2 ]");
            }
        }
        while (choix < 1 || choix > 2);

        return choix;
    }

    public static void ShopMenu(Zones zone, Heros Gerald, ShopState state) {
        Scanner read = new Scanner(System.in);

        int choix = 0;

        String soldableArmor = "";
        String soldableWeapon = "";
        int priceArmorWeapon = 0;
        int addUpMaxHP = 0;
        int addUpDMG = 0;
        int addUpAmmo = 0;
        int newHitPercent = 0;

        do {
            System.out.println("\nVoulez vous acheter quelque chose avant la prochaine manche ? Vos pieces d'or [ " + Gerald.getCoins() + " coins ]");
            System.out.println("1 - Full HP Potion [ 25 coins ]");
            System.out.println("2 - 5 More Ammo [ 10 coins ]");

            switch (zone) {
                case VerdantGrove:
                    if (!state.boughtArmor) {
                        System.out.println("3 - Acheter " + Armor.SylvanheartRaiment + " + 6 MaxHP [ 20 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    if (!state.boughtWeapon) {
                        System.out.println("4 - Acheter " + Weapon.ThornlashGlaive + " + 4 DMG | + 6 Ammo | 55% HitChance [ 20 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    priceArmorWeapon = 20;
                    addUpMaxHP = 6;
                    addUpDMG = 4;
                    addUpAmmo = 6;
                    newHitPercent = 55;

                    break;

                case ScorchwindBarrens:
                    if (!state.boughtArmor) {
                        System.out.println("3 - Acheter " + Armor.AshrunnerMantle + " + 15 MaxHP [ 60 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    if (!state.boughtWeapon) {
                        System.out.println("4 - Acheter " + Weapon.ScorchfangBlades + " + 5 DMG | + 10 Ammo | 60% HitChance [ 60 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    priceArmorWeapon = 60;
                    addUpMaxHP = 15;
                    addUpDMG = 5;
                    addUpAmmo = 10;
                    newHitPercent = 60;

                    break;

                case EmbercoreCrater:
                    if (!state.boughtArmor) {
                        System.out.println("3 - Acheter " + Armor.MagmaforgedAegis + "  + 25 MaxHP [ 115 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    if (!state.boughtWeapon) {
                        System.out.println("4 - Acheter " + Weapon.CoreburstMaul + " + 10 DMG | + 10 Ammo | 70% HitChance [ 115 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    priceArmorWeapon = 115;
                    addUpMaxHP = 25;
                    addUpDMG = 10;
                    addUpAmmo = 10;
                    newHitPercent = 70;

                    break;

                case ThornecastleRuins:
                    if (!state.boughtArmor) {
                        System.out.println("3 - Acheter " + Armor.ThornboundPlate + " + 35 MaxHP [ 190 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    if (!state.boughtWeapon) {
                        System.out.println("4 - Acheter " + Weapon.Wailrend + " + 20 DMG | + 15 Ammo | 85% HitChance [ 190 coins ]");
                    } else {
                        System.out.println("SOLDOUT");
                    }
                    priceArmorWeapon = 190;
                    addUpMaxHP = 35;
                    addUpDMG = 20;
                    addUpAmmo = 15;
                    newHitPercent = 85;

                    break;
            }

            System.out.println("0 - Quitter le Shop");

            choix = read.nextInt();

            switch (choix) {
                case 1:
                    if (Gerald.getCoins() >= 25) {
                        System.out.println("Vous avez achetez la potion. Full HP");
                        Gerald.spendCoins(25);
                        Gerald.moreHealth(Gerald.getMaxHealth());
                    } else {
                        System.out.println("Vous n'avez pas assez d'or");
                    }
                    break;

                case 2:
                    if (Gerald.getCoins() >= 10) {
                        System.out.println("Vous avez achetez les munitions. +5 Ammo");
                        Gerald.spendCoins(10);
                        Gerald.moreAmmo(5);
                    } else {
                        System.out.println("Vous n'avez pas assez d'or");
                    }
                    break;

                case 3:
                    if (!state.boughtArmor) {
                        if (Gerald.getCoins() >= priceArmorWeapon) {
                            System.out.println(soldableArmor);
                            Gerald.spendCoins(priceArmorWeapon);
                            Gerald.addMaxHealth(addUpMaxHP);
                            Gerald.moreHealth(Gerald.getMaxHealth());

                            state.boughtArmor = true;
                        } else {
                            System.out.println("Vous n'avez pas assez d'or");
                        }
                    } else {
                        System.out.println("Vous avez deja acheter cette armure");
                    }
                    break;

                case 4:
                    if (!state.boughtWeapon) {
                        if (Gerald.getCoins() >= priceArmorWeapon) {
                            System.out.println(soldableWeapon);
                            Gerald.spendCoins(priceArmorWeapon);
                            Gerald.moreDamage(addUpDMG);
                            Gerald.moreAmmo(addUpAmmo);
                            Gerald.newHitPercent(newHitPercent);

                            state.boughtWeapon = true;
                        } else {
                            System.out.println("Vous n'avez pas assez d'or");
                        }
                    } else {
                        System.out.println("Vous avez deja acheter cette arme");
                    }
                    break;
            }
        } while (choix != 0);
    }

    public static void AfficherMonstres(ArrayList<Monstre> ListeMonstre) {
        for (Monstre mon : ListeMonstre) {
            mon.afficherEtat();
        }
    }
}

