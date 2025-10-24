package 정처기대비;
//다른걸로도 풀어볼것 브3문제


import java.util.Scanner;

public class N_10872 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();

    int fac = 1;

    for(int i = 1; i <= A; i++) {
        fac *= i;
    }
    System.out.println(fac);
    sc.close();
    }
}
