import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N==1) {
			System.out.println(1);
			return;
		}
		
		int max =1;
		int layer = 1;
		
		while(max<N) {
			max += 6*layer;
			layer++;
		}
		System.out.println(layer);
	}

}
