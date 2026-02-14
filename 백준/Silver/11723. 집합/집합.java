import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int set = 0;

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set |= (1 << (x - 1));

            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set &= ~(1 << (x - 1));

            } else if (cmd.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if ((set & (1 << (x - 1))) != 0) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }

            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                set ^= (1 << (x - 1));

            } else if (cmd.equals("all")) {
                set = (1 << 20) - 1;

            } else if (cmd.equals("empty")) {
                set = 0;
            }
        }

        System.out.print(sb);
    }
}
