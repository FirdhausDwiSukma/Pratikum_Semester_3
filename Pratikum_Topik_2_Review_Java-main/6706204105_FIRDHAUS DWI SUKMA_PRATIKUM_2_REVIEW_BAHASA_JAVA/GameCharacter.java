package com.pbo.topik2;

public class GameCharacter {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    public void hit(GameCharacter karB){
        karB.lifePoint = karB.getLifePoint() - this.attackHitPoint;
    }

    public void kick(GameCharacter karB){
        karB.lifePoint = karB.getLifePoint() - this.attackKickPoint;
    }

    public GameCharacter(String name, int lifePoint, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.lifePoint = lifePoint;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public int getLifePoint(){
        return lifePoint;
    }

    public String getName(){
        return name;
    }
}
