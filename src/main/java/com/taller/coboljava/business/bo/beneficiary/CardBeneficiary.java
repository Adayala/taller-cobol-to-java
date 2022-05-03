package com.taller.coboljava.business.bo.beneficiary;

public abstract class CardBeneficiary extends Beneficiary{
    private String walletId;

    public CardBeneficiary(String name, String walletId) {
        super(name);
        this.walletId = walletId;
    }

    public String getWalletId() {
        return walletId;
    }

    @Override
    public String toString() {
        return "CardBeneficiary{" +
                "name='" + name + '\'' +
                ", walletId='" + walletId + '\'' +
                '}';
    }
}
