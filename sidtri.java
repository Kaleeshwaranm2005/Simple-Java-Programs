import java.util.*;
public class sidtri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        float T;
        double area;
        System.out.println("Enter the 3 Sides of a Triangle");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        T = (a + b + c)/2F;
        area = Math.sqrt(T * (T - a) * (T - b) * (T - c));
        System.out.println("Area is  :  " + area);
    }
}
