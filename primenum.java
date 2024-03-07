import java.util.*;
public class primenum {
    public static void  main(String[] args) {
        int n = 5;
        //boolean isprime = true;
        if(n==2){
            System.out.println("its prime");
        }
            for(int i =2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("its not prime");
                }
                else{
                    System.out.println("its a prime");
                }
            }
            
    
        }
    }
    

