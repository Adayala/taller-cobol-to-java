package com.taller.coboljava.business.bo.payer;

public abstract class Payer {
    protected String name;

    public Payer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
