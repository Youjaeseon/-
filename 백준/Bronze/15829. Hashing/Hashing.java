import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        final long M = 1234567891;
        final long R = 31;

        long hash = 0L; 
        long pow = 1L; // R^0

        for (int i = 0; i < L; i++) {
            int ai = s.charAt(i) - 'a' + 1; // a=1 ... z=26
            hash = (hash + (ai * pow) % M) % M;
            pow = (pow * R) % M; // 다음 거듭제곱으로
        }

        System.out.println(hash);
    }
}
