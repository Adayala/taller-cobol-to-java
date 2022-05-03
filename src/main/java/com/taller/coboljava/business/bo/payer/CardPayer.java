package com.taller.coboljava.business.bo.payer;

public abstract class CardPayer extends Payer {

    protected String cardNumber;

    public CardPayer(String name, String cardNumber) {
        super(name);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "CardPayer{" +
                "cardNumber='" + cardNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
