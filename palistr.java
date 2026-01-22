import java.util.*;
class palistr{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String p = "";
        for(int i=str.length()-1;i>=0;i--){
            p = p + str.charAt(i);
            System.out.println(p);
        }
        if(str.equalsIgnoreCase(p)) System.out.println("Palindrome String");
        else System.out.println("Not a String Palindrome");
    }
}