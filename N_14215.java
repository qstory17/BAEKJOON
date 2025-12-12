package B3;

import java.util.Scanner;

//영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
//
//영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
//
//각 막대의 길이는 양의 정수이다
//세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
//삼각형의 둘레를 최대로 해야 한다.
//        a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
/*
a+b<c 삼각형이 되려면 이런 조건이어야하고 정수
c가 가장 긴 변인데 a+b보다 c가 크다면
c= a+b-1
아울러 제일 긴 변 -1 을 만족해야하고
둘레 길이 뽑는거니 a+b+c = 2(a+b)-1

c가 그렇게 까지 크지 않다면 a+b+c
각 자리에 어느 숫자가 올 지 모르니
가장 큰수 하나를 찾고 그 값을 나머지 수의 합과 비교 하면 되겠다!


*/
public class N_14215 {
    public static void main(String[] args) {
        int arr [] = new int [3];
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int T = 0;
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]) {
                T = i;
                max = arr[i];
            }
        }

        int sum = 0;
        for(int i = 0; i < 3; i++) {
            if(T != i)
                sum += arr[i];
        }

        while(arr[T] >= sum)
            arr[T]--;

        System.out.println(sum + arr[T]);

        sc.close();
    }
}