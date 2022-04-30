package com.taller.coboljava.business.bo.payment;

import com.taller.coboljava.business.bo.payer.CardPayer;
import com.taller.coboljava.business.bo.payer.Payer;

import java.math.BigDecimal;

public abstract class CardPayment extends Payment{
    public CardPayment(CardPayer payerData, BigDecimal amount) {
        super(payerData, amount);
    }
}
