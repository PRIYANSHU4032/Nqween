public class x_to_the_power_n {
    public static int optimizedPower(int a,int n){
        if(n==0){
            return 1;
        }

        int halfpower = optimizedPower(a,n/2);
        int halfpowersq = halfpower * halfpower;
        if(n%2 != 0){
            halfpowersq = a*halfpowersq;
        }

        return halfpowersq;
    }

    public static void main(String[] args) {
        int n =2,m=10;
        System.out.println(optimizedPower(n, m));
    }
}
