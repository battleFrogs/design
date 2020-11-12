package com.gjc.observate.entity;

public class CriminalObservable extends Observable {

    public void crime(String event) {
        System.out.println("罪犯在" + event);
        notifyObserver(event);
    }


}
