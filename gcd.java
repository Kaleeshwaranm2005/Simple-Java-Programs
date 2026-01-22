import java.util.*;
class gcd{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else if(b>a){
                b = b-a;
            }
        }
        if(a==1){
        System.out.println("No GCD");
    }
    else System.out.println(a);
}
}