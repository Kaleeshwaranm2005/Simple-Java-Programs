import java.util.*;
class adamnum{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ntemp = n;
        int r = 0;
        while(n != 0){
            r = r*10 + (n%10);
            n/=10;
        }
        int ntsq = ntemp * ntemp;
        int rsq = r * r;
        int rt = 0;
        while(rsq != 0){
            rt = rt*10 + (rsq%10);
            rsq/=10;
        }
        if(rt == ntsq) System.out.println("Adam Number");
        else System.out.println("Not Adam Number");
    }
}