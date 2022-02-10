package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Hero[] heroes = createHeroes();
        for (Hero heroesAll : heroes) {
            System.out.println("Health: " + heroesAll.getHealth() +
                    ", Damage " + heroesAll.getDamage() + ", Type of Protection: " + heroesAll.getSuperpowers());
        }
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(30);
        boss.setTypeOfProtection("Invulnerable");
        System.out.println("Boss info: health: " + boss.getHealth() +
                ", damage: " + boss.getDamage() + ", type of protection: " + boss.getTypeOfProtection());
    }
    public static Hero[] createHeroes () {
        Hero Artur = new Hero(200, 20, "Physical");
        Hero Merlin = new Hero(200, 20, "Magical");
        Hero xxx = new Hero(200, 20);
        Hero[] heroes = {Artur, Merlin, xxx};
        return heroes;
    }
}

