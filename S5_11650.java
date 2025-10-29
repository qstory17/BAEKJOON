package 정처기대비;

import java.io.*;
import java.util.*;

public class S5_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken()); // x
            points[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1]; // x가 같으면 y 비교
            return a[0] - b[0]; // x 비교
        });

        StringBuilder sb = new StringBuilder();
        for (int[] point : points) {
            sb.append(point[0]).append(" ").append(point[1]).append("\n");
        }
        System.out.print(sb);
    }
}