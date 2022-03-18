package com.pbo.topik2;

public class MainCharacter {
    public static void main(String[] args) {
        GameCharacter raiden = new GameCharacter("Raiden", 100, 10, 25);
        GameCharacter subZero = new GameCharacter("Sub-Zero", 100, 5, 25);

        raiden.kick(subZero);
        subZero.kick(raiden);

        for (int i = 0; i < 3; i++) {
            subZero.hit(raiden);
        }
        for (int i = 0; i < 4; i++) {
            raiden.hit(subZero);
        }

        System.out.println("LifePoint");
        System.out.println(raiden.getName() + " " + raiden.getLifePoint());
        System.out.println(subZero.getName() + " " + subZero.getLifePoint());

        if (raiden.getLifePoint() > subZero.getLifePoint()){
            System.out.println("Pemenangnya adalah : " + raiden.getName());
        } else {
            System.out.println("Pemenangnya adalah : " + subZero.getName());
        }
    }
}
