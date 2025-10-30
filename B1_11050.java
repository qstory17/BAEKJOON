package 정처기대비;
/*
자연수
\(N\)과 정수
\(K\)가 주어졌을 때 이항 계수
\(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.

입력
첫째 줄에
\(N\)과
\(K\)가 주어진다. (1 ≤
\(N\) ≤ 10, 0 ≤
\(K\) ≤
\(N\))

출력

\(\binom{N}{K}\)를 출력한다.

예제 입력 1
5 2
예제 출력 1
10
 */
    /**
     * (참고) 팩토리얼 계산 함수 (재귀 방식)
     * public static int factorial_recursive(int n) {
     * // 0! 또는 1!은 1이다. (Base Case)
     * if (n <= 1) {
     * return 1;
     * }
     * // n! = n * (n-1)! (Recursive Step)
     * return n * factorial_recursive(n - 1);
     * }
     */
}
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B1_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
