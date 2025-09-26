package B5;
/*
import java.util.Scanner;

public class N_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        int X = ((A*A)+(B*B)+(C*C)+(D*D)+(E*E))%10;

        System.out.println(X);
        sc.close();
    }
}
*/

import java.util.Scanner;

public class N_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sum += num * num;
        }
        System.out.println(sum % 10);
        sc.close();
    }
}