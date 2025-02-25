package Adapter_Design_Patter_2;

import Adapter_Design_Patter_2.thirdpartyApis.HDFCbank;

public class HDFCBankAdapter implements BankApiAdapter{
    private String accName;
    private HDFCbank hdfcBank;

    public HDFCBankAdapter(String accName) {
        this.accName = accName;
        this.hdfcBank = new HDFCbank(accName);
    }
    @Override
    public double balance() {
        System.out.print("Balance of "+this.accName+ " is: " );
        return hdfcBank.balanceCheck();
    }

    @Override
    public void deposit(double amount, String to) {
        System.out.println("deposited " +amount+" from: "+ hdfcBank.getUserAccountName()+" to: " + to);

    }
}
