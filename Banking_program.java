import java.util.*;
public class Banking_program {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]){
        double balance = 1000;
        boolean isRunning = true;
        int choice;
        while(isRunning){
        System.out.println("****************");
        System.out.println("Banking Program:");
        System.out.println("****************");
        System.out.println("1.Show Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("****************");
        System.out.println("Enter Your Choice (1-4) only.");
        choice = s.nextInt();
        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance = balance + deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid Choice");
        }
        }
        System.out.println("****************");
        System.out.println("Thank You for Contacting us! For further Information contact Instagram profile:nxxtery.x");
        System.out.println("****************");
        s.close();
    }   
    static void showBalance(double balance){
        System.out.printf("₹%.2f",balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter an amount to be Deposited : ");
        amount = s.nextDouble();
        if(amount < 0) {
            System.out.println("Amount Can't Be Negative.");
            return 0;
        }
        else{
            return amount ;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to be withdrawn : ");
        amount = s.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient Balance!!!!!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be Negative");
            return 0; 
        }
        else{
            return amount;
        }
    }
}