import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int Count = 0;
		
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();			
			if(isPrime(A)) 
			Count++;
		}
	System.out.println(Count);
	}
	
	public static boolean isPrime(int n) {
		if(n<2) 
			return false;
		  for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	}

}
