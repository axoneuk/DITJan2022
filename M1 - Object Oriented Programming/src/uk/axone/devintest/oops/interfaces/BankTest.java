package uk.axone.devintest.oops.interfaces;

public class BankTest {

    public static void main(String[] args) {

        //An interface cannot be instantiated
        //Bank myBank = new Bank();
        System.out.println(Bank.FIN_INST_TYPE);

        HSBC highSt = new HSBC("40-42-09");
        highSt.depositCash(89548945);
        highSt.applyPension();
        highSt.processMortgageAppl();

        Bank bk1 = new HSBC("00-09-98");
        bk1.depositCash(903);
        bk1.checkBalance();
        //bk1.applyPension();


    }

}
