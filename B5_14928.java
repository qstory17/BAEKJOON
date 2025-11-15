package B5;

import java.util.Scanner;

public class B5_14928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine(); // 매우 큰 수를 문자열로 입력받음
        int mod = 20000303;
        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            result = (result * 10 + (N.charAt(i) - '0')) % mod;
        }

        System.out.println(result);
    }
}