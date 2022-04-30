package com.taller.coboljava.business.bo.payment;

import com.taller.coboljava.business.bo.beneficiary.Beneficiary;
import com.taller.coboljava.business.bo.beneficiary.CryptoBeneficiary;
import com.taller.coboljava.business.bo.payer.CryptoPayer;
import com.taller.coboljava.business.bo.payer.Payer;

import java.math.BigDecimal;

public abstract class CryptoPayment extends PaymentWithBeneficiary {
    public CryptoPayment(CryptoPayer payerData, BigDecimal amount, CryptoBeneficiary beneficiary) {
        super(payerData, amount, beneficiary);
    }
}
