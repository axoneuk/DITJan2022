package uk.axone.devintest.oops.interfaces;

public class Barclays implements Bank{


    void applyPersonalLoan(){

    }

    @Override
    public void depositCash(int amount) {
        //Barclays specific code
    }

    @Override
    public boolean withdrawCash(int amount) {
        //Barclays specific code
        return false;
    }

    @Override
    public int checkBalance() {
        //Barclays specific code
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
}
