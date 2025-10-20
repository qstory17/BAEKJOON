package B3;

import java.io.*;
import java.util.StringTokenizer;

        public class N_2738{
            public static void N_2738(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                int[][] result = new int[N][M];

                // 행렬 A 입력
                for (int i = 0; i < N; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < M; j++) {
                        result[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                // 행렬 B 입력 및 덧셈
                for (int i = 0; i < N; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < M; j++) {
                        result[i][j] += Integer.parseInt(st.nextToken());
                    }
                }

                // 결과 출력
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
        }
}
