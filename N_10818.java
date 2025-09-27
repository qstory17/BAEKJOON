package B3;
/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
5
20 10 35 30 7
->7 35
min = 0 넣으니.. 최소값이 이미 나와버려 0만출력되는데
무작위의 숫자를 정렬하고 첫번째 마지막 뽑아도..?

*/
import java.util.Scanner;

public class N_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int [N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

//           // for(int j = 0; j <= i; j++){
//                min = Math.min(arr[i], min);//min이 문제네..였는데
//                max = Math.max(arr[i], max);
//
//            //}
        System.out.println(min + " " + max);
        sc.close();
    }
}

/*
import java.util.Scanner;

public class N_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println(min + " " + max);
        sc.close(); // Scanner 닫기
    }
}

 */

/*
import java.util.Arrays;
import java.util.Scanner;

public class N_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[N - 1];

        System.out.println(min + " " + max);
        sc.close();
    }
}

 */