package B4;//미제출
    //    BufferedReader
    //    BufferedWriter
    //    BufferedWriter.flush
import java.io.*;
import java.util.StringTokenizer;

public class N_15552 {
    public static void main(String[] args) throws IOException {

        //long startTime = System.currentTimeMillis();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A + B).append("\n");
        }


        System.out.print(sb);

        //long endTime = System.currentTimeMillis();
        //System.out.println("\n실행 시간: " + (endTime - startTime) + "ms");
    }
}