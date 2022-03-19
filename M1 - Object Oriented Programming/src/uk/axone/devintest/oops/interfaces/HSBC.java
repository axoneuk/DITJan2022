package uk.axone.devintest.oops.interfaces;

public class HSBC implements Bank, UKSecurityStandards{

    private String sortCode;
    private String branchName;

    public HSBC(String sortCode){
        this.sortCode = sortCode;
    }

    void processMortgageAppl(){

    }

    void applyPension(){

    }

    @Override
    public void depositCash(int amount) {
        //HSBC specific code
    }

    @Override
    public boolean withdrawCash(int amount) {
        //HSBC specific code
        return false;
    }

    @Override
    public int checkBalance() {
        //HSBC specific code
        return 0;
    }

    @Override
    public int getCompanyNumber() {
        return 0;
    }

    @Override
    public String getVATNumber() {
        return null;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getEncryptionType() {
        return 0;
    }
}
