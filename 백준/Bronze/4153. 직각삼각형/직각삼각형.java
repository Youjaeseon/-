import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();		

		if(A == 0 && B == 0 && C ==0) {
			break ;
		}
		
		if(A*A+B*B == C*C || A*A+C*C==B*B || B*B+C*C==A*A) {
			sb.append("right\n");
		}
		else {
			sb.append("wrong\n");
		}
}
		System.out.print(sb.toString());
}
}