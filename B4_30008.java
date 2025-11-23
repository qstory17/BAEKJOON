package B4;

import java.util.Scanner;

public class B4_30008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        int[] b = new int[k];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < b.length; i++) {
            b[i] = (a[i] * 100) / n;
            if(0 <= b[i] && b[i] <= 4) {
                b[i] = 1;
            }else if(4 < b[i] && b[i] <= 11) {
                b[i] = 2;
            }else if(11 < b[i] && b[i] <= 23) {
                b[i] = 3;
            }else if(23 < b[i] && b[i] <= 40) {
                b[i] = 4;
            }else if(40 < b[i] && b[i] <= 60) {
                b[i] = 5;
            }else if(60 < b[i] && b[i] <= 77) {
                b[i] = 6;
            }else if(77 < b[i] && b[i] <= 89) {
                b[i] = 7;
            }else if(89 < b[i] && b[i] <= 96) {
                b[i] = 8;
            }else if(96 < b[i] && b[i] <= 100) {
                b[i] = 9;
            }
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
}