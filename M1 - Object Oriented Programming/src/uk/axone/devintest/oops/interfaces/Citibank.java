package uk.axone.devintest.oops.interfaces;

public class Citibank implements Bank {

    @Override
    public void depositCash(int amount) {

    }

    @Override
    public boolean withdrawCash(int amount) {
        return false;
    }

    @Override
    public int checkBalance() {
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
