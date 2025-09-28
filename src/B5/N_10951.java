package B5;




/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
1 1
2 3
3 4
9 8
5 2
--
2
5
7
17
7

 */

import java.util.Scanner;

public class N_10951 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);

    }
    sc.close();
    }
}
