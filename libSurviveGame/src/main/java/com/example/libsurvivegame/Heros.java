package com.example.libsurvivegame;

public class Heros extends Personnage {
    private String gender;
    public String getGender() {
        return gender;
    }
    private void setGender(String gender) {
        this.gender = gender;
    }

    private int coins;
    public int getCoins() { return coins; }
    private void setCoins(int coins) {
        this.coins = coins;
    }

    private int hitPercent;
    public int getHitPercent() { return hitPercent; }
    private void setHitPercent(int hitPercent) {
        this.hitPercent = hitPercent;
    }
    public void newHitPercent (int amount) {
        setHitPercent(amount);
    }

    public void addCoins(int amount) {
        setCoins(getCoins() + amount);
    }
    public boolean spendCoins(int amount) {
        if (getCoins() >= amount) {
            setCoins(getCoins() - amount);
            return true;
        }
        return false;
    }

    private int maxHealth;
    public int getMaxHealth() { return maxHealth; }
    private void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void addMaxHealth(int amount) {
        setMaxHealth(getMaxHealth() + amount);
    }

    public Heros(String name, int health, int ammo, int damage, boolean alive, String gender, int coins, int hitPercent, int maxHealth) {
        super(name, health, ammo, damage, alive);
        setGender(gender);
        setCoins(coins);
        setHitPercent(hitPercent);
        setMaxHealth(maxHealth);
    }

    @Override
    public void afficherEtat() {
        System.out.println(getName() + " a " + getHealth() + " point de vie sur " + getMaxHealth() + " point de vie max, a " + getAmmo() +
                                    " munitions, fait un total de " + getDamage() + " degats avec " + getHitPercent() + "% de chance et a " + getCoins() + " pieces d'or");
    }
}
