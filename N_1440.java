package B2;
//다시풀어봐야함
/*
import java.util.Scanner;

public class N_1440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a == 0 && b == 0 && c == 0) {
            System.out.println(0);
        }   else if (a <= 12 && b <= 12 && c <= 12) {
            System.out.println(6);
        }   else if (a<=12 || b<=12 || c<=12) {
            System.out.println(2);
        }   else {
            System.out.println(4);
        }
        sc.close();
    }
}*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1440 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.in 키보드로 입력 받은걸 인풋스트림리더의 힙으로 올리고 리더로 올린걸 br에 저장
        //인풋스트림은 byte를 문자 단위로 바꿔줌

        String[] localDate = br.readLine().split(":");

        int len = localDate.length;
        int count = 0;

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                for(int k = 0; k < len; k++) {
                    //i와 j와 k가 모두 다르고, 각 시간이 가질 수 있는 조건을 만족할 때, count를 증가시킨다.
                    if(i != j && i != k && j != k && readAble(localDate[i], localDate[j], localDate[k])) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static boolean readAble(String h, String m, String s) {
        boolean flag = false;

        int hour = Integer.parseInt(h);
        int minute = Integer.parseInt(m);
        int second = Integer.parseInt(s);

        if ((hour >= 1 && hour <= 12) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
            flag = true;
        }

         return flag;

    }
}