package com.taller.coboljava.business.bo.payer;

public abstract class TransferPayer extends Payer{

    protected String cbu;

    public TransferPayer(String name, String cbu) {
        super(name);
        this.cbu = cbu;
    }

    public String getCbu() {
        return cbu;
    }
}
