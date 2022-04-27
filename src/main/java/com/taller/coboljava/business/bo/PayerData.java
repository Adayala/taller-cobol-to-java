package com.taller.coboljava.business.bo;

public class PayerData {
    private String cbu;
    private String name;
    private String cardNumber;
    private String walletId;

    public PayerData (String cbu, String name, String cardNumber, String walletId) {
        this.cbu = cbu;
        this.name = name;
        this.cardNumber = cardNumber;
        this.walletId = walletId;
    }


    public String getCbu() {
        return cbu;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getWalletId() {
        return walletId;
    }
}
