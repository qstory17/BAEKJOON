package B5;



/*
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
A=65
C=67
0=48
9=57
a=97
z=122
 */

import java.util.Scanner;

public class N_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((int) ch);

    }
}
