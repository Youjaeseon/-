import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] A = new int[N];
		
		for (int i = 0 ;i<N ; i++) {
			
			A[i] = sc.nextInt();
			
		}
		
		int best = 0;
		
		 for (int i = 0; i < N - 2; i++) {
	            for (int j = i + 1; j < N - 1; j++) {
	                for (int k = j + 1; k < N; k++) {
	                    int sum = A[i] + A[j] + A[k];
	                    if (sum <= M && sum > best) {
	                        best = sum;
	                   
	                    if (best == M) {
	                        System.out.println(best);
	                        return;
		
	}

	                    }
	                    }
	                }
	            }
	      System.out.println(best);
		 }
	}
