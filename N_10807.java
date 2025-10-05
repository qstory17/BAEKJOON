package B5;
/*
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

11
1 4 1 2 4 2 4 2 3 4 4
2
->3

11
1 4 1 2 4 2 4 2 3 4 4
5
->0
 */

/*
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class N_10807 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        for(int i=0; i<quantity;i++){
            int array = sc.nextInt();
            list.add(array);
        }
        int du = sc.nextInt();
        long counts = list.stream().filter(result -> result == du).count();
        System.out.println(counts);
    }
}
*/

import java.util.*;

public class N_10807{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int[] arr = new int[num];

        for(int i=0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        for(int j=0; j<arr.length;j++){
        if(arr[j] == search) count++;
        }
        System.out.println(count);
    }
}