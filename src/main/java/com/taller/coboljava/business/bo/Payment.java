package com.taller.coboljava.business.bo;

import java.math.BigDecimal;

public class Payment {
    private PayerData payerData;
    private BigDecimal amount;
    private PaymentType paymentType;
    private BeneficiaryData beneficiaryData;

    public Payment(PayerData payerData, BigDecimal amount, PaymentType paymentType, BeneficiaryData beneficiaryData) {
        this.payerData = payerData;
        this.amount = amount;
        this.paymentType= paymentType;
        this.beneficiaryData = beneficiaryData;
    }

    public PayerData getPayerData() {
        return payerData;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public BeneficiaryData getBeneficiaryData() {
        return beneficiaryData;
    }

    public void cubrirGastosDeTransaccion(BigDecimal amount2){
        if (!cubierto) {
            amount = amount.add(amount2);
            cubierto = true;
        }
    }

}
