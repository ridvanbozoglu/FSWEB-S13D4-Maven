package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public int  loseHealth(int damage){
        if(healthPercentage<damage){
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }else {
            healthPercentage = healthPercentage - damage;
        }
        return healthPercentage;
    }

    public int restoreHealth(int healthPotion){
        if(100 < ( healthPotion + healthPercentage )){
            healthPercentage = 100;
        }else {
            healthPercentage = healthPercentage + healthPotion;
        }

        return healthPercentage;
    }

}
