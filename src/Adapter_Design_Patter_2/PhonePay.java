package Adapter_Design_Patter_2;

public class PhonePay {
    private BankApiAdapter bankApiAdapter;
    public PhonePay(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = bankApiAdapter;
    }

    public double getMyBalance(){
        return bankApiAdapter.balance();
    }

    public void depositAmount(double amount, String depositAccountName){
        bankApiAdapter.deposit(amount, depositAccountName);
    }
}
