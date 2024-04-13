// Change file name to Bank.java
class Bank {
    private String bankName;
    private int depositAmount;
    static int totalAmount;

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void setAmount(int depositAmount) {
        this.depositAmount = depositAmount;
        totalAmount += depositAmount;
    }

    void showData() {
        System.out.println("Bank name : " + bankName);
        System.out.println("Deposit amount: Rs. " + depositAmount);
        System.out.println();
    }

    static void displayMinDepositBank(Bank[] banks) {
        int minAmount = Integer.MAX_VALUE;
        String minDepositBank = null;

        for (Bank bank : banks) {
            if (bank.depositAmount < minAmount) {
                minAmount = bank.depositAmount;
                minDepositBank = bank.bankName;
            }
        }
        System.out.println("Bank with minimum deposit amount: " + minDepositBank);
    }

    public static void main(String[] args) {
        Bank[] banks = new Bank[5];

        banks[0] = new Bank();
        banks[0].setBankName("SBI");
        banks[0].setAmount(1500);

        banks[1] = new Bank();
        banks[1].setBankName("PNB");
        banks[1].setAmount(2000);

        banks[2] = new Bank();
        banks[2].setBankName("BOI");
        banks[2].setAmount(1200);

        banks[3] = new Bank();
        banks[3].setBankName("HDFC");
        banks[3].setAmount(1800);

        banks[4] = new Bank();
        banks[4].setBankName("Kotak");
        banks[4].setAmount(2500);

        for (Bank bank : banks) {
            bank.showData();
        }

        System.out.println("Total Amount Deposited: Rs. " + totalAmount);
        displayMinDepositBank(banks);
    }
}

/*
 * Output:
 *      Bank name : SBI
 *      Deposit amount: Rs. 1500
 *
 *      Bank name : PNB
 *      Deposit amount: Rs. 2000
 *
 *      Bank name : BOI
 *      Deposit amount: Rs. 1200
 *
 *      Bank name : HDFC
 *      Deposit amount: Rs. 1800
 *
 *      Bank name : Kotak
 *      Deposit amount: Rs. 2500
 *
 *      Total Amount Deposited: Rs. 9000
 *      Bank with minimum deposit amount: BOI
 */
