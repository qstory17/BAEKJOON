package B2;
/*
문제
신원이는 백준에서 배수에 관한 문제를 풀다가 감명을 받아 새로운 문제를 만들어보았다. 자연수 N과 M개의 자연수 Ki가 주어진다. Ki중 적어도 하나의 배수이면서 1 이상 N 이하인 수의 합을 구하여라.

입력
첫 번째 줄에 N과 M가 주어진다. (2 ≤ N ≤ 1000, 1 ≤ M < N)

그다음 줄에 M개의 정수 Ki가 주어진다. (2 ≤ Ki ≤ 1000)

동일한 Ki는 주어지지 않으며, 오름차순으로 정렬되어있다.

출력
배수들의 합을 출력한다.

예제 입력 1
10 2
2 3
예제 출력 1
42
예제 입력 2
1000 3
3 5 7
예제 출력 2
272066
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B2_17173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] K = new int[M];
        for (int i = 0; i < M; i++) {
            K[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] visited = new boolean[N + 1];
        int sum = 0;

        for (int i = 0; i < M; i++) {
            for (int j = K[i]; j <= N; j += K[i]) {
                if (!visited[j]) {
                    visited[j] = true;
                    sum += j;
                }
            }
        }

        System.out.println(sum);
    }
}