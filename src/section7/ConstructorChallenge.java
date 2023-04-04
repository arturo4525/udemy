package section7;

public class ConstructorChallenge {

    public static void main(String[] args) {

        Customer customer = new Customer("Anders", 100, "test@mail.com");
        Customer secondCustomer = new Customer("Kalle","Kalle@gmail.com");
        Customer thirdCustomer = new Customer();
        Customer fourthCustomer= new Customer(50.0,"Tim","Hej@mail.se");
        Customer fifthCustomer= new Customer(50.0,"Tim","Tim@mail.se");



       System.out.println("AccountNo: " + customer.getName() + "; limit is " + customer.getCreditLimit() + " email: " + customer.getEmailAdress());
       System.out.println("AccountNo: " + secondCustomer.getName() + "; limit is " + secondCustomer.getCreditLimit() + " email: " + secondCustomer.getEmailAdress());
       System.out.println("AccountNo: " + thirdCustomer.getName() + "; limit is " + thirdCustomer.getCreditLimit() + " email: " + thirdCustomer.getEmailAdress());
       System.out.println("AccountNo: " + fourthCustomer.getName() + "; limit is " + fourthCustomer.getCreditLimit() + " email: " + fourthCustomer.getEmailAdress());
       System.out.println("AccountNo: " + fifthCustomer.getName() + "; limit is " + fifthCustomer.getCreditLimit() + " email: " + fifthCustomer.getEmailAdress());
    }
}
