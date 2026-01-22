import java.util.*;
class greatestdig{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int g = 0;
        int t = 0;
        while(n!=0){
            t=n%10;
            if(t>g){
                g=t;
            }
            n/=10;
        }
        System.out.println(g);
    }
}