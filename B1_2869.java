package B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

        public class B1_2869 {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String[] input = br.readLine().split(" ");
                int A = Integer.parseInt(input[0]);
                int B = Integer.parseInt(input[1]);
                int V = Integer.parseInt(input[2]);

                int day = (V - B) / (A - B);
                if ((V - B) % (A - B) != 0) {
                    day++;
                }

                System.out.println(day);
            }
        }