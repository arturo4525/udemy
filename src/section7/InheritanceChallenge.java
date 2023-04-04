package section7;

public class InheritanceChallenge {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "12/11/1991", "01/03/2023", 35000 );
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

        Employee putte = new Employee("Putte", "11/11/1990","01/31/2023");
        System.out.println(putte);

        joe.retire();
        System.out.println("Joe's Pension Check = $" + joe.collectPay());


    }
}
