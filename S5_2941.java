package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String[] croatia = {
                "dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="
        };

        for (String c : croatia) {
            word = word.replace(c, "*");
        }

        System.out.println(word.length());
    }
}
