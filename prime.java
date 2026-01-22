import java.util.*;
class prime{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("Composite or Not a Prime");
                System.exit(0);
            }
        }
              System.out.println("Prime");
    }
}