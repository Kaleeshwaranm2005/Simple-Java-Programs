import java.util.*;
class harshad{                  //Harshad Number is also known as Niven Number
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int d = 0;
        while(temp != 0){
            d = d + (temp%10);
            temp/=10;
        }
        if(n%d==0) System.out.println("Harshad Number"); 
        else System.out.println("Not Harshad Number");
    }
}