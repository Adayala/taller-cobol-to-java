package com.taller.coboljava;

import com.taller.coboljava.business.bo.BeneficiaryData;
import com.taller.coboljava.business.bo.PayerData;
import com.taller.coboljava.business.bo.Payment;
import com.taller.coboljava.business.bo.PaymentType;

import java.math.BigDecimal;
import java.util.Scanner;

public class Application {
    private static Scanner in = new Scanner(System.in);

    public static void main(String... args) throws InterruptedException {
        Integer option = 0;
        do {
            printPaymentTypes();

            String s = in.nextLine();
            option = Integer.parseInt(s);
            Payment p = null;
            switch (option) {
                case 1:
                    p = getTransfer();
                    break;
                case 2:
                    p = getCard();
                    break;
                case 3:
                    p = getCrypto();
                    break;
            }
            if (p != null) {
                if (p.paymentType == PaymentType.CARD) {
                    Thread.sleep(1000);
                }
                if (p.paymentType == PaymentType.TRANSFER) {
                    Thread.sleep(4000);
                }
                if (p.paymentType == PaymentType.CRYPTO) {
                    Thread.sleep(2000);
                }
            }
        } while (option != 4);
    }

    private static Payment getCrypto() {
        System.out.println("Ingrese su nombre");
        String name = in.nextLine();
        System.out.println("Ingrese el id de su billetera");
        String walletId = in.nextLine();
        System.out.println("Ingrese el nombre del destinatario");
        String beneficiaryName = in.nextLine();
        System.out.println("Ingrese el id de la billetera de destino");
        String beneficiaryWalletId = in.nextLine();
        System.out.println("Ingrese el monto");
        BigDecimal amount = new BigDecimal(in.nextLine());
        PayerData payerData = new PayerData(null, name, null, walletId);
        BeneficiaryData beneficiaryData = new BeneficiaryData(null, beneficiaryName, beneficiaryWalletId);
        Payment payment = new Payment(payerData, amount, PaymentType.CRYPTO, beneficiaryData );


        System.out.println("Ejecutando pago" + payment.paymentType.name()
                + "|" + payment.amount + "|" + payment.payerData.walletId + "|"
                + payment.beneficiaryData.walletId);
        return payment;
    }

    private static Payment getCard() {
        System.out.println("Ingrese su nombre");
        String name = in.nextLine();
        System.out.println("Ingrese el numero de su tarjeta");
        String card = in.nextLine();
        System.out.println("Ingrese el monto");
        BigDecimal amount = new BigDecimal(in.nextLine());
        PayerData payerData = new PayerData(null, name, card, null);
        BeneficiaryData beneficiaryData = new BeneficiaryData(null, null, null);
        Payment payment = new Payment(payerData, amount, PaymentType.CARD, null );


        System.out.println("Ejecutando pago" + payment.paymentType.name()
                + "|" + payment.amount + "|" + payment.payerData.name + "|"
                + payment.payerData.cardNumber);
        return payment;
    }

    private static Payment getTransfer() {
        System.out.println("Ingrese su nombre");
        String name = in.nextLine();
        System.out.println("Ingrese su cbu");
        String cbu = in.nextLine();
        System.out.println("Ingrese el nombre del beneficiario");
        String beneficiaryName = in.nextLine();
        System.out.println("Ingrese el cbu beneficiario");
        String beneficiaryCbu = in.nextLine();
        System.out.println("Ingrese el monto");
        BigDecimal amount = new BigDecimal(in.nextLine());


        PayerData  payerData = new PayerData(name, cbu, null, null);
        BeneficiaryData beneficiaryData = new BeneficiaryData(beneficiaryCbu, beneficiaryName, null);
        Payment payment = new Payment(payerData, amount, PaymentType.TRANSFER, beneficiaryData );


        System.out.println("Ejecutando pago" + payment.paymentType.name()
                + "|" + payment.amount + "|" + payment.payerData.name + "|"
                + payment.payerData.cbu + "|" + payment.beneficiaryData.name + "|"
                + payment.beneficiaryData.cbu);
        return payment;
    }

    private static void printPaymentTypes() {
        System.out.println("Seleccione una opcion de pago");
        PaymentType last = null;
        for (PaymentType paymentType : PaymentType.values()) {
            System.out.println(paymentType.ordinal() + 1 + "- " + paymentType.name());
            last = paymentType;
        }
        System.out.println(last.ordinal() + 2 + "- EXIT");
        System.out.print("Selecciono: ");
    }
}
