package com.example.libsurvivegame;
public class Monstre extends Personnage {
    private String race;
    public String getRace() {
        return race;
    }
    private void setRace(String race) {
        this.race = race;
    }

    private boolean passive;
    public boolean isPassive() {
        return passive;
    }
    private void setPassive(boolean passive) {
        this.passive = passive;
    }

    public Monstre(String name, int health, int ammo, int damage, boolean alive, String race, boolean passive) {
        super(name, health, ammo, damage, alive);
        setRace(race);
        setPassive(passive);
    }

    @Override
    public void afficherEtat() {
        System.out.println(getName() + " a " + getHealth() + " point de vie, " + getAmmo() + " munitions, fait un total de " + getDamage() + " degats et est un monstre passif: " + isPassive());
    }
}
