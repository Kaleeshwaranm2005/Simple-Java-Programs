import java.util.*;
public class numguessgame{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int attempts = 0;
        System.out.println("-----------------WELCOME TO NUMBER GUESSING GAME-----------------");
        System.out.print("Enter the Minimum number in the game : ");
        int min = s.nextInt();
        System.out.print("Enter the Maximum number in the game : ");
        int max = s.nextInt();
        int randomnum = rand.nextInt(min,max+1);
        System.out.println("The Maximum number in the game is " + max + " and the Minimum number in the game is " + min);
        do { 
            System.out.print("Enter the Guess : ");
            guess = s.nextInt();
            attempts++;
            if(guess < randomnum) System.out.println("Too LOW !! Try Again..!!");
            else if(guess > randomnum) System.out.println("Too High !, So Try Again..!!");
            else System.out.println("The guessed number is correct " + randomnum);
        } while (guess != randomnum);
        s.close();
    }
}