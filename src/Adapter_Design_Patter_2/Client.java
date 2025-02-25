package Adapter_Design_Patter_2;

import Adapter_Design_Patter_2.thirdpartyApis.Yesbank;

public class Client {
    public static void main(String[] args) {
        BankApiAdapter bankApiAdapter = new YesBankAdapter("Yesbank4567");
        PhonePay phonePay = new PhonePay(bankApiAdapter);
        double balance = phonePay.getMyBalance();
        System.out.print(balance+"\n");

        phonePay.depositAmount(100, "IDK4567");



        BankApiAdapter bankApiAdapter2 = new HDFCBankAdapter("HDFCBank1010");
        PhonePay phonePay2 = new PhonePay(bankApiAdapter2);
        double balance2 = phonePay2.getMyBalance();
        System.out.print(balance2+"\n");

        phonePay2.depositAmount(1000, "IDK1010");
    }
}
