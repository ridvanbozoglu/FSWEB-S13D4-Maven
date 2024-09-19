package org.example;

public enum Weapon {
    SWORD(12,0.5),
    LOVE(100,10),
    HATE(10,1.5),
    PEN(80,0.2);

    private int damage;
    private double attackSpeed;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
}
