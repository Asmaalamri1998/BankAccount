public class BAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.depositCheck(3000);
        account1.withdrawalcheck(1000);
        

        account2.depositsav(3000);
        account2.withdrawalsav(1000);


        account1.totalAmou();
        account2.totalAmou();






        
    }
}
