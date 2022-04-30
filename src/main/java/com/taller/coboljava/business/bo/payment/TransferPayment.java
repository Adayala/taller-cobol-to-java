package com.taller.coboljava.business.bo.payment;

import com.taller.coboljava.business.bo.payer.Payer;
import com.taller.coboljava.business.bo.payer.TransferPayer;

import java.math.BigDecimal;

public abstract class TransferPayment extends Payment {
    public TransferPayment(TransferPayer payerData, BigDecimal amount) {
        super(payerData, amount);
    }
}
