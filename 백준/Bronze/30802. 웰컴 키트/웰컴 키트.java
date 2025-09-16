import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long s = sc.nextLong();
        long m = sc.nextLong();
        long l = sc.nextLong();
        long xl = sc.nextLong();
        long xxl = sc.nextLong();
        long xxxl = sc.nextLong();

        long T = sc.nextLong();
        long P = sc.nextLong();

        long tshirtBundles = 0;

        tshirtBundles += (s + T - 1) / T;
        tshirtBundles += (m + T - 1) / T;
        tshirtBundles += (l + T - 1) / T;
        tshirtBundles += (xl + T - 1) / T;
        tshirtBundles += (xxl + T - 1) / T;
        tshirtBundles += (xxxl + T - 1) / T;

        System.out.println(tshirtBundles);

        long penBundles = N / P; 
        long penSingles = N % P; 
        System.out.println(penBundles + " " + penSingles);

        sc.close();
    }
}
