import java.util.Scanner;
public class twodimensionarray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String fruits[] = {"apple","Mango"};
        String[] vegetables = {"Carrot","potato"};
        String[][] groceries = {fruits,vegetables};

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}