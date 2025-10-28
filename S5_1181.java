package 정처기대비;
/*


스트림개꿀문제
 */

import java.util.*;
import java.util.stream.*;

public class S5_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            words.add(sc.nextLine());
        }

        words.stream()
                .distinct() // << 중복제거
                .sorted((a, b) -> { //<<sorted
                    if (a.length() == b.length()) {
                        return a.compareTo(b);
                    }
                    return a.length() - b.length();
                })
                .forEach(System.out::println);
    }
}

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return a.length() - b.length();
            }
        });

        for (String word : list) {
            System.out.println(word);
        }
    }
}
 */