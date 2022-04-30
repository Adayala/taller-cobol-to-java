package com.taller.coboljava.business.bo.beneficiary;

public abstract class TransferBeneficiary extends Beneficiary{
    protected String cbu;

    public TransferBeneficiary(String name, String cbu) {
        super(name);
        this.cbu = cbu;
    }

    public String getCbu() {
        return cbu;
    }
}
