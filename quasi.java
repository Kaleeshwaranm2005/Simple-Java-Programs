import java.util.*; //betrothed number or quasi-amiciable numbers
class quasi{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<=m/2;i++){
            if(m%i==0){
                sum1 = sum1 + i;
            }
        }
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum2 = sum2 + i;
            }
        }
        if((m + 1)==sum2  &&  (n + 1)==sum1) System.out.println("Betrothed Numbers");
        else System.out.println("Not Betrothed Numbers");
    }
}