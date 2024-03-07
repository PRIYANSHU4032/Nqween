public class print_1_to_n {
    public static void printInt(int n){
        if(n==1){
            System.out.println(n);
        }
         System.out.println(n);
        printInt(n-1);
       
    }

    public static void main(String args[]){
        int n = 9;
        printInt(n);

    }

}
    