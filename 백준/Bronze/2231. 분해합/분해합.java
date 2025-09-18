import java.util.Scanner;

public class Main {
	
    static int digitSum(int x) {
        int s = 0;
        while (x > 0) {      
            s += x % 10;     
            x /= 10;         
        }
        return s;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int answer = 0;               
        for (int m = 1; m < N; m++) { 
            if (m + digitSum(m) == N) {
                answer = m;           
                break;                
            }
        }
        System.out.println(answer);
    }
}
