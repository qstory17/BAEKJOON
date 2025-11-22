package B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_12790 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int baseHp = Integer.parseInt(st.nextToken());
            int baseMp = Integer.parseInt(st.nextToken());
            int baseAttack = Integer.parseInt(st.nextToken());
            int baseDefense = Integer.parseInt(st.nextToken());

            int addHp = Integer.parseInt(st.nextToken());
            int addMp = Integer.parseInt(st.nextToken());
            int addAttack = Integer.parseInt(st.nextToken());
            int addDefense = Integer.parseInt(st.nextToken());

            int hp = baseHp + addHp;
            int mp = baseMp + addMp;
            int attack = baseAttack + addAttack;
            int defense = baseDefense + addDefense;
            
            if (hp < 1) hp = 1;
            if (mp < 1) mp = 1;
            if (attack < 0) attack = 0;

            int power = hp + 5 * mp + 2 * attack + 2 * defense;
            System.out.println(power);
        }
    }
}