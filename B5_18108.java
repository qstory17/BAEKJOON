package B5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B5_18108 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int year = Integer.parseInt(s);

        System.out.println(year - 543);
    }
}