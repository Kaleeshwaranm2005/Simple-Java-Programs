import java.util.Scanner;

public class Compoundintrestcalculator{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        double principal = s.nextDouble();
        System.out.println("Enter the Intrest Rate (in %) : ");
        double rate = s.nextDouble() / 100;
        System.out.println("Enter the number of Times Compounded per Year");
        int timescompounded = s.nextInt();
        System.out.println("Enter the no.of Years : ");
        int years = s.nextInt();
        double amount = principal * Math.pow(1 + rate / timescompounded, timescompounded*years);
        System.out.printf("The Amount after %d years is %f ", years, amount);
        s.close();
    }
}