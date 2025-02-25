package Adapter_Design_Patter_2.thirdpartyApis;

public class HDFCbank {
    private String bankName;
    public HDFCbank(String bankName) {
        this.bankName = bankName;
    }

    public double balanceCheck() {
        return 112233.12;
    }

    public String getUserAccountName(){
        return this.bankName;
    }
}
