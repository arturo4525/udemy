package section7;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public Customer(double creditLimit, String name, String emailAdress){
        this.name = name;
        this.creditLimit = creditLimit;
        if (emailAdress.equals("Hej@mail.se")){
            this.emailAdress = "bajs@mail.se";

        }else{
            this.emailAdress = emailAdress;
        }
    }
    public Customer(){
        this("nobody", "nobody@nowhere.com");
    }
    public Customer(String name, String emailAdress){
        this(name, 1000, emailAdress);
    }


    public Customer(String name, double creditLimit, String emailAdress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }





}
