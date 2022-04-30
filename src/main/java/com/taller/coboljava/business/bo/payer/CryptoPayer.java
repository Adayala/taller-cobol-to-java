package com.taller.coboljava.business.bo.payer;

public abstract class CryptoPayer extends Payer{

    protected String walletId;

    public CryptoPayer(String name, String walletId) {
        super(name);
        this.walletId = walletId;
    }

    public String getWalletId() {
        return walletId;
    }
}
