package section7;

public class MainAtm {
    public static void main(String[] args) {
        Account andersAccount = new Account();

        andersAccount.setNumber("12345");
        andersAccount.setBalance(1000.00);
        andersAccount.setCustomerPhone("Anders Donaire");
        andersAccount.setCostumerEmail("anders.donaire@anders.com");
        andersAccount.setCustomerPhone("08-7492665");
        andersAccount.withdrawFunds(100);
        andersAccount.depositFunds(250);
        andersAccount.withdrawFunds(50);

        andersAccount.withdrawFunds(200);
        andersAccount.depositFunds(100);
        andersAccount.withdrawFunds(45.55);
        andersAccount.withdrawFunds(54.46);

        Account mySecondAccount = new Account("Anders", "anders@gmail.com", "08028");
        System.out.println("AccountNo: " + mySecondAccount.getNumber() + "; name " + mySecondAccount.getCostumerName());

    }
}
