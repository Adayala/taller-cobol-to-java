package com.taller.coboljava.business.bo;

public class BeneficiaryData {
    private String cbu;
    private String name;
    private String walletId;

    public BeneficiaryData (String cbu, String name, String walletId ) {
        this.cbu = cbu;
        this.name = name;
        this.walletId = walletId;
    }

    public String getCbu() {
        return cbu;
    }

    public String getName() {
        return name;
    }

    public String getWalletId() {
        return walletId;
    }
}
