package B2;
/*
2
3 ABC
5 /HTP
 */

import java.util.Scanner;

public class N_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
//        while ( R > 8) {
//            break;
//        }
        for (int i = 0; i < T; i++) {

        int R = sc.nextInt();
        String S = sc.next(); // string? char?

            for (int j = 0; j < S.length(); j++) {
                for(int k = 0;  k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
