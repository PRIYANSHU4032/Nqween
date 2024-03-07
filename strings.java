import java.util.*;
public class strings{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname;
        String lastname;
        String name;
        //System.out.println("enter your name :");
        //name = sc.next();
        //System.out.println(name);
        //System.out.println("enter your full name : ");
       // name = sc.nextLine();
        //System.out.println(name);
        System.out.println("Enter your first name :");
        firstname = sc.next();
        System.out.println("Enter your last name :");
        lastname = sc.next();
        name = firstname+" "+lastname;
        System.out.println(name);

        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }



    }
}
