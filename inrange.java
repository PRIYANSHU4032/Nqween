public class inrange {
    public static void main(String[] args) {
        int n = 30;
        for (int j = 1; j < n; j++) {
            if (j == 2) {
                System.out.println("its prime");
            }
            for (int i = 2; i <= j; i++) {
                if (j % i != 0) {
                    System.out.println(j);
                } //else {
                    //System.out.println("its a prime" + j);
               // }
            }

        }
    }
}
