package B5;

import java.util.Scanner;

public class B5_27959 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 가진 돈 (단위: 원)
        int m = scanner.nextInt(); // 초코바 가격 (단위: 원)

        int sum = n * 100; // 100원짜리 n개를 가진 경우 총 금액

        if (sum >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
