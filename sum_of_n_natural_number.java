public class sum_of_n_natural_number {
    public static int sumNumbers(int n){
        if(n==1){
            return 1;
        }

        int snm1 = sumNumbers(n-1);
        int sum = n+snm1;
        return sum;
    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println(sumNumbers(num));
    }
}
