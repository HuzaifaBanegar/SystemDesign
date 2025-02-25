package Adapter_Design_Patter_2.thirdpartyApis;

public class Yesbank {
    private String accountName;
    public Yesbank(String accountName) {
        this.accountName = accountName;
    }
    public double balanceCheck2(String accountName) {
        return 55.56;
    }

    public String getAccountName(){
        return this.accountName;
    }
}
