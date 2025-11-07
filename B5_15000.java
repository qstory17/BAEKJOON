package B5;
/*
예제 입력 1
alert
예제 출력 1
ALERT
예제 입력 2
earthisunderattack
예제 출력 2
EARTHISUNDERATTACK
예제 입력 3
canyoupickupsomegroceries
예제 출력 3
CANYOUPICKUPSOMEGROCERIES
 */
import java.util.Scanner;

public class B5_15000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        message = message.toUpperCase();
        System.out.println(message);
    }
}