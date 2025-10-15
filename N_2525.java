package B3;

import java.util.Scanner;
//브3, 좀더 쉬운방법있을거같은데..
public class N_2525 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    int r = sc.nextInt();
    int a = (m + r)/60;
    int b = (m + r)%60;

    if (m + r < 60 ) {
        System.out.print(h + " ");
        System.out.print(m + r);
    } else if (m + r >= 60 && h + a >= 24 ) {
        System.out.print(h + a - 24 + " ");
        System.out.print(b);
    } else {
        System.out.print(h + a + " ");
        System.out.print(b);
    }
    sc.close();

    }
}
