package lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hi01 {
    public static void main(String[] args) {
        Pro01 pro01 = new Pro01();
        String[] players = new String[]{"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = new String[]{"kai", "kai", "mine", "mine"};
        String[] solution = pro01.solution(players, callings);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Pro01 {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = new String[players.length];

            HashMap<String, Integer> mappedByPlayer = new HashMap<>();
            HashMap<Integer, String> mappedByRank = new HashMap<>();

            for (int i = 0; i < players.length; i++) {
                mappedByPlayer.put(players[i], i);
                mappedByRank.put(i, players[i]);
            }

            for (int i = 0; i < callings.length; i++) {
                int currentRank = mappedByPlayer.get(callings[i]);
                String player = mappedByRank.get(currentRank);

                String frontPlayer = mappedByRank.get(currentRank - 1);

                // swap
                mappedByPlayer.put(player, currentRank - 1);
                mappedByPlayer.put(frontPlayer, currentRank);

                mappedByRank.put(currentRank - 1, player);
                mappedByRank.put(currentRank, frontPlayer);
            }

            for (int i = 0; i < players.length; i++) {
                answer[i] = mappedByRank.get(i);
            }

            return answer;
        }
    }
}
