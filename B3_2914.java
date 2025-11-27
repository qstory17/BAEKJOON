package B3;

import java.util.Scanner;

public class B3_2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int I = sc.nextInt();

        System.out.println(A * (I - 1) + 1);

        sc.close();
    }
}