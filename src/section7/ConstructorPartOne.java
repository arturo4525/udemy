package section7;

public class ConstructorPartOne {

        private String number;
        private double balance;
        private String costumerName;
        private String costumerEmail;
        private String customerPhone;

        public void depositFunds(double depositAmount) {
            balance += depositAmount;
            System.out.println("Deposit of $" + depositAmount + " made. New balance is $ + " + balance);
        }

        public void withdrawFunds(double withdrawalAmount) {
            if (balance - withdrawalAmount < 0) {
                System.out.println("Insufficient Funds! You only have $" + balance + " in your account");
            } else {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal of $" + withdrawalAmount + "processed, remaining balance = $" + balance);
            }
        }

        public String getNumber() {

            return number;
        }

        public void setNumber(String number) {

            this.number = number;
        }

        public double getBalance() {

            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCostumerName() {
            return costumerName;
        }

        public void setCostumerName(String costumerName) {
            this.costumerName = costumerName;
        }

        public String getCostumerEmail() {
            return costumerEmail;
        }

        public void setCostumerEmail(String costumerEmail) {
            this.costumerEmail = costumerEmail;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }
    }


