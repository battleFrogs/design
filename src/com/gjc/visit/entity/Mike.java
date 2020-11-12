package com.gjc.visit.entity;

import com.gjc.visit.entity.IVisitor;

public class Mike implements IVisitor {

    @Override
    public void chooseLobster(String lobster) {
        System.out.println("Mike get a " + lobster);

    }

    @Override
    public void chooseWatermelon(String watermelon) {
        System.out.println("Mike get a " + watermelon);
    }

    @Override
    public void chooseSteak(String steak) {
        System.out.println("Mike doesn't like " + steak);
    }

    @Override
    public void chooseBanana(String banana) {
        System.out.println("Mike doesn't like " + banana);
    }
}
