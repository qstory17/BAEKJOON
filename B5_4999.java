package B5;

import java.util.Scanner;

public class B5_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String j = sc.next();
        String d = sc.next();
        sc.close();

        if (j.length() >= d.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}