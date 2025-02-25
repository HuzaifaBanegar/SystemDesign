package Adapter_Design_Patter_2;

public interface BankApiAdapter {
    public double balance();
    public void deposit(double amount, String to);

}
