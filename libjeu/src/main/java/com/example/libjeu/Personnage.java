package com.example.libjeu;

public class Personnage implements IJeu {
    private String name;
    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name.isEmpty())
            throw new IllegalArgumentException("La nom ne peut pas etre vide");

        this.name = name;
    }

    private int health;
    public int getHealth() {
        return health;
    }
    private void setHealth(int health) {
        this.health = health;
    }

    private int ammo;
    public int getAmmo() {
        return ammo;
    }
    private void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    private int damage;
    public int getDamage() {
        return damage;
    }
    private void setDamage(int damage) {
        this.damage = damage;
    }

    private boolean alive;
    public boolean isAlive() {
        return alive;
    }
    private void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Personnage(String name, int health, int ammo, int damage, boolean alive) {
        setName(name);
        setHealth(health);
        setAmmo(ammo);
        setDamage(damage);
        setAlive(alive);
    }

    @Override
    public int attaquer(Personnage P) {
        int damageDealt = this.damage;

        P.setHealth(P.getHealth() - damageDealt);

        if (P.getHealth() <= 0)
            P.setAlive(false);

        return damageDealt;
    }

    @Override
    public void afficherEtat() {
        System.out.println(getName() + " a" + getHealth() + " point de vie ," + getAmmo() + " munitions et fait un total de" + getDamage() + " degats");
    }
}
