import java.util.*;
class arms{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int d = n;
        int p = 0;
        int k = 0;
        while(n!=0){
            n/=10;
            p++;
        }
        while(d != 0){
            k = (int) (k + Math.pow((d%10),p));
            d/=10;
        }
        if(k==temp) System.out.println("Armstrong number");
        else System.out.println("Not Armstrong number");
    }
}