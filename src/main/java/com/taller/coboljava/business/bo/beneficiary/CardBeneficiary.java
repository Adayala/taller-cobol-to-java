package com.taller.coboljava.business.bo.beneficiary;

public abstract class CardBeneficiary extends Beneficiary{
    protected String walletId;

    public CardBeneficiary(String name, String walletId) {
        super(name);
        this.walletId = walletId;
    }

    public String getWalletId() {
        return walletId;
    }
}
