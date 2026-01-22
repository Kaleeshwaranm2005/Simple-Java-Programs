import java.util.*;
public class Main{
    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the countdown... : ");
        int v = s.nextInt();
        TimerTask task = new TimerTask(){
            int count = v;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("HAPPY NEW YEAR !!!!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}