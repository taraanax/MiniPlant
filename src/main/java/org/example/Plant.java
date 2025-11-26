package org.example;

public class Plant {

    private int health;
    private int water;
    private int sun;
    private int happiness;

    public Plant() {

        //stats
        this.health = 100;
        this.water = 50;
        this.sun = 50;
        this.happiness = 50;
    }

    //getters
    public int getHealth() {
        return health;
    }

    public int getWater() {
        return water;
    }

    public int getSun() {
        return sun;
    }

    public int getHappiness() {
        return happiness;
    }

    //zalivanje
    public void waterPlant() {
        water += 10;
        happiness += 2;
        checkHealth();
    }

    //sončenje
    public void giveSun() {
        sun += 10;
        happiness += 2;
        checkHealth();
    }

    //preventiva, da ni op
    private void checkHealth() {
        if (water < 20 || sun < 20) {
            health -= 5;
        } else if (water > 80 || sun > 80) {
            health -= 3;
        } else {
            health += 1;
        }

        //da ni funny numbers
        if (health > 100) health = 100;
        if (health < 0) health = 0;
    }
}
