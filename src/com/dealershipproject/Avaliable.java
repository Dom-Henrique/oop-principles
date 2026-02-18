package com.dealershipproject;

public enum Avaliable {
    AVALIABLE(true), NOTAVALIABLE(false);

    private boolean avaliable;
    Avaliable(boolean avaliable){
        this.avaliable = avaliable;
    }
}
