
import java.util.*;
public class str_palindrom {
    public static boolean isPalindrom(String str){
        for(int i=0;i<str.length();i++){
             int n = str.length();
             if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
             }

        }
        return true;
    }

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the string :");
        name = sc.next();
        //isPalindrom(name);
        System.out.println(isPalindrom(name));
    }
}
