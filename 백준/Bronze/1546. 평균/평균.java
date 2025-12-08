import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] M = new int[N];
		int Max = 0;
		double sum =0;
		
		for(int i = 0; i<N ; i++) {
			M[i]=sc.nextInt();
		
			if(M[i] > Max) {
				Max = M[i];
			}
		}
		
		for(int i =0; i<N; i++) {
			
				sum += (double) M[i]/Max*100;
		
			}
		
		System.out.println(sum/N);
	}
}
