package B4;
/*
문제
앞으로 맞이할 새천년을 기념하며 지은 새천년관. 건물 이름을 정한 지 천 년이 지나, 어느덧 3000년이 되었다. 이제 새천년관에 새로운 이름이 필요하다!

쿠는 아래 조건을 모두 만족시키는 새로운 이름을 지어주려고 한다.

건물 이름은 알파벳 소문자로만 이루어져야 한다.
건물 이름의 맨 앞 글자와 맨 뒤 글자는 같은 글자여야 한다.
건물 이름에 알파벳 k와 u가 포함되어 있어야 한다.
건물 이름의 마지막
$4$글자는 gwan이어야 한다.
건물 이름의 길이가
$50$보다 짧거나 같아야 한다.
쿠는 너무 바빠서 건물 이름을 정하지 못했다. 쿠를 대신해서 조건을 모두 만족시키는 건물 이름을 지어주자.

입력
입력은 없다.

출력
주어진 조건을 모두 만족시키는 건물 이름을 아무거나 하나 출력한다.

예제 입력 1
예제 출력 1
kukugwan

 */

import java.util.*;

public class B4_33701 {
    public static void main(String[] args) {
        int N = (int) (5 + 45 * Math.random()); // 이름 길이: 5~50
        char[] name = new char[N];

        // 랜덤 소문자 채우기
        for (int i = 0; i < N; i++) {
            name[i] = (char) ('a' + (int)(Math.random() * 26));
        }

        // k와 u 포함시키기 (중복 방지)
        int idx1 = (int)(Math.random() * (N - 4));
        int idx2 = (int)(Math.random() * (N - 4));
        while (idx1 == idx2) {
            idx2 = (int)(Math.random() * (N - 4));
        }
        name[idx1] = 'k';
        name[idx2] = 'u';

        // 마지막 4글자 gwan으로 설정
        name[N - 4] = 'g';
        name[N - 3] = 'w';
        name[N - 2] = 'a';
        name[N - 1] = 'n';

        // 첫 글자와 마지막 글자 같게 설정
        name[0] = name[N - 1];

        // 결과 출력
        System.out.println(new String(name));
    }
}