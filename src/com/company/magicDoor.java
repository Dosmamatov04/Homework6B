package com.company;

public class magicDoor {

    public static Hero[] Door(){

        Hero h1 = new Hero(250,50,15);
        Hero h2 = new Hero(250,50,15);
        Hero h3 = new Hero(250,50,15);
        Hero h4 = new Hero(250,50,15);

        Hero[] players = {h1, h2, h3, h4};
        return players;

    }

}