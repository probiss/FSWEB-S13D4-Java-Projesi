package com.workintech.s13d4;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Enum for Weapon
    public enum Weapon {
        DUCK,
    }

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    public void checkHealth(int healthPercentage) {
        if(healthPercentage > 100) {
            this.healthPercentage = 100;
        }else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining () {
        return healthPercentage;
    }

    public void loseHealth(int damage){
        healthPercentage -= damage;

        if(healthPercentage < 0) {
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;

        if(healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Sakal", 90, Weapon.DUCK);
        System.out.println("Player: " + player.name);
        System.out.println("Health Percentage: " + player.healthRemaining());

        // Decrease health by 30
        player.loseHealth(30);
        System.out.println("Remaining Health after taking damage: " + player.healthRemaining());

        // Restore health by using health potion
        player.restoreHealth(20);
        System.out.println("Remaining Health after using health potion: " + player.healthRemaining());

        // Knock out player
        player.loseHealth(100);
    }
}
