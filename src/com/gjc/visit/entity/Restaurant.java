package com.gjc.visit.entity;

public class Restaurant {

    private String lobster = "lobster";
    private String watermelon = "watermelon";
    private String steak = "steak";
    private String banana = "banana";

    public void welcome(IVisitor visitor) {
        visitor.chooseBanana(banana);
        visitor.chooseLobster(lobster);
        visitor.chooseSteak(steak);
        visitor.chooseWatermelon(watermelon);
    }


}
