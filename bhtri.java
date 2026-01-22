import java.util.*;
class bhtri{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        float base,height,area;
        System.out.println("Enter the Base and Height");
        base = s.nextFloat();
        height = s.nextFloat();
        area = base*height/2;
        System.out.println("Area of a Triangle is : " + area);
    }
}