public class tiling_problem {
    public static int tilling(int n){
        if(n==0 || n==1){
            return 1;
        }

        //vertical
        int fnm1 = tilling(n-1);
        //horizontal
        int fnm2 = tilling(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void main(String[] args) {
        //the dimension is 3:2
        int d = 5;
        System.out.println(tilling(d));
    }
}
