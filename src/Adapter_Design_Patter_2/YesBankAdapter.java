package Adapter_Design_Patter_2;

import Adapter_Design_Patter_2.thirdpartyApis.Yesbank;

public class YesBankAdapter implements BankApiAdapter{
    private Yesbank yesbank;
    private String accountName;

    public YesBankAdapter(String accountName) {
        this.accountName = accountName;
        this.yesbank = new Yesbank(accountName);
    }

    @Override
    public double balance() {
        System.out.print("Balance of "+this.accountName+ " is: " );
        return yesbank.balanceCheck2(this.accountName);
    }

    @Override
    public void deposit(double amount, String to) {
        System.out.println("deposited " +amount+" from: "+ yesbank.getAccountName()+" to: " + to);
    }

}
