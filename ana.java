import java.util.*;
class ana{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        char A[] = a.toCharArray();
        char B[] = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        if(Arrays.equals(A,B)){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("It is not a Anagram");
        }
    }
}