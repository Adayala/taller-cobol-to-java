package com.taller.coboljava.business.bo.beneficiary;

public abstract class CryptoBeneficiary extends Beneficiary {
    protected String walletId;

    public CryptoBeneficiary(String name, String walletId) {
        super(name);
        this.walletId = walletId;
    }

    public String getWalletId() {
        return walletId;
    }
}
