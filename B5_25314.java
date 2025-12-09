package B5;

import java.util.Scanner;

public class B5_25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 0; i <  a; i++){
            if(i % 4 == 0)
                System.out.print("long ");
        }
        System.out.println("int");

        scanner.close();
    }
}