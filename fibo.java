import java.util.*;
class fibo{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+","+b+",");
        for(int i=3;i<=n;i++)
        {
            if(i==n){
                c=a+b;
            a=b;
            b=c;
            System.out.print(c); 
            }
            else{
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
            }
        }
    }
}