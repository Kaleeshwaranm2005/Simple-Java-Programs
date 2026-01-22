import java.util.*;
class PalinNo {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int p = 0;
        while(n != 0){
            p = p*10 + (n%10);
            n/=10; 
        }
        if(temp == p){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}