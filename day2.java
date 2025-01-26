class BankAccount{

    private String accountNumber;

    private double balance;

    BankAccount(String accountNumber,double balance){

        this.accountNumber = accountNumber;

        this.balance = balance;

    }

    public void deposit(double amount){

        if(amount>0){

            balance+= amount;

        }else{

            System.out.println("Wrong inputs");

        }

    }

    public void  withdraw(double amount){

        if(amount<=balance){

            balance-= amount;

        }else{

            System.out.println("Insufficient funds!");

        }

    }

    public void displayDetails(){

        System.out.println("Account Number : "+accountNumber);

        System.out.printf("Balance : "+"%.2f",balance);

    }

}