public class fibonacci_series_recursion {
    public static int fabonaci(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fnm1 = fabonaci(n-1);
        int fnm2 = fabonaci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
        }
        public static void main(String[] args) {
            int n = 10;
            System.out.println(fabonaci(n));
        }
}
