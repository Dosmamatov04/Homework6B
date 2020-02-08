package com.company;

import java.util.Random;

public class Boss {

    public static String[] changeBossDefence = {"Physical", "Magical", "Kinetic"};

    public static int bossHealth;
    public static int bossAttack;
    public static String bossDefenceType = "";

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossAttack() {
        return bossAttack;
    }

    public void setBossAttack(int bossAttack) {
        this.bossAttack = bossAttack;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }
    public static void changeBossDefence(){
        Random r = new Random();
        int randomIndex = r.nextInt(3);
        bossDefenceType = changeBossDefence[randomIndex];
    }


}
