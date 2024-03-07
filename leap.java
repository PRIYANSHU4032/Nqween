//import java.util.Scanner;

import java.util.*;
public class leap {
    public static void getYear (int y){
        if(y%4==0&&y%100!=0||y%400==0){
            System.out.println(y+" is leap year");
        }
        else{
            System.out.println(y+" is not leap year");
        }

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the year : ");
        x = sc.nextInt();
        getYear(x);

    }
    
}
