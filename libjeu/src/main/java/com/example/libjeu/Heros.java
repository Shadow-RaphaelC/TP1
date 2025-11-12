package com.example.libjeu;

public class Heros extends Personnage {
    private String gender;
    public String getGender() {
        return gender;
    }
    private void setGender(String gender) {
        if (gender.isEmpty() && (!gender.equalsIgnoreCase("homme") || !gender.equalsIgnoreCase("femme")))
            throw new IllegalArgumentException("La genre ne peut pas etre vide ou autre que ceux selectionee");

        this.gender = gender;
    }

    public Heros(String name, int health, int ammo, int damage, boolean alive, String gender) {
        super(name, health, ammo, damage, alive);
        setGender(gender);
    }
}
