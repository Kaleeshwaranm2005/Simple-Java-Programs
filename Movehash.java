import java.util.*;
public class Movehash{
    public static void movehash(String str,int n){
        String str1 = new String("");
        String str2 = new String("");
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='#') str1 = str1+str.charAt(i);
            else str2 = str2 + str.charAt(i);
        }
        String result = str1.concat(str2);
        System.out.println(result);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int len = a.length();
        movehash(a,len);
    }
}


/*import java.util.*;

public class newcode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();//
        String s1="";
        String s2="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                s2+=str.charAt(i);

            }
            else{
                s1+=str.charAt(i);
            }

        }
        System.out.println(s1+s2);
    }
} */