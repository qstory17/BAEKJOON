package B2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class N_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());
        int number = A * B * C;

        int[] counts = new int[10];
        if (number == 0) counts[0] = 1;
        while (number > 0) {
            counts[number % 10]++;
            number /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(counts[i]).append('\n');
        }
        System.out.print(sb.toString());
    }
}

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());
        int product = A * B * C;

        int[] counts = new int[10];
        String s = String.valueOf(product);
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(counts[i]).append('\n');
        }
        System.out.print(sb.toString());
    }
}
 */