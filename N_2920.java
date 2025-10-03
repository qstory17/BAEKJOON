package B2;
//미제출
import java.util.Scanner;

public class N_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int C = sc.nextInt();

        if (c == 1 && d == 2 && e == 3 && f == 4 && g == 5 && a == 6 && b == 7 && C == 8) {
            System.out.println("ascending");
        } else if (c == 8 && d == 7 && e == 6 && f == 5 && g == 4 && a == 3 && b == 2 && C == 1) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        ;
    }
}


/* gpt버전
import java.util.Scanner;

public class N_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[8];

        for (int i = 0; i < 8; i++) {
            notes[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 7; i++) {
            if (notes[i] < notes[i + 1]) {
                descending = false;
            } else if (notes[i] > notes[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}

 */