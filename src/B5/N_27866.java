package B5;
/*
Sprout
3
= r

shiftpsh
6
=p


Baekjoon
4
=k

charAt -1해야 답이 나오네..?
 */
import java.util.Scanner;

public class N_27866 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int i = sc.nextInt();

    char p = S.charAt(i-1);
        System.out.println(p);
    }
}
