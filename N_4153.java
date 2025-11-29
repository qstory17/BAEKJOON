package B3;
/*

각입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

a^2=b^+c^2 을 만족하는수
맥스구하기
Math써볼까
max
0 0 0 시 종료 조건이빠져서 틀림...
while로 탈출ㅜ

 */


import java.util.Scanner;

public class N_4153 {
    public static void main(String[] args) {
        //int arr [] = new int arr [3];
        Scanner sc = new Scanner(System.in);

        while(true) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 0 && b == 0 && c == 0) break;


        int sqa = a * a;
        int sqb = b * b;
        int sqc = c * c;

        int max = Math.max(sqa, Math.max(sqb, sqc)); //max는 두수끼리 비교만 가능해서 중첩으로//버블정렬
            //저는 Math.max를 for if 써야하나...햇는데..
        int other = sqa + sqb + sqc - max;

        if (max == other) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
        }
        sc.close();
    }
}
////
//        int otherSum = 0;
//        for(int i = 0; i < 3; i++) {
//            if(i != max) otherSum += arr[i];
//
//
//
//        for (int i = 1; i <=3 ; i++)
//            if(i)
//        if()
//
//        int Math.max()=0;
