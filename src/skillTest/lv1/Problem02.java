package skillTest.lv1;

import java.util.Arrays;
import java.util.Objects;

public class Problem02 {

    public static void main(String[] args) {
        Pro02 pro02 = new Pro02();
        int[] bananas = pro02.solution("banana");
        int[] foobars = pro02.solution("foobar");
        System.out.println("banana = " + Arrays.toString(bananas));
        System.out.println("foobar = " + Arrays.toString(foobars));
    }

    static class Pro02 {
        public int[] solution(String s) {
            String[] split = s.split("");
            char[] chars = s.toCharArray();
            int[] answer = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                if (i == 0) {
                    answer[i] = -1;
                } else {
                    long l = countChar(s, chars[i]);
                    if (l == 1) {
                        answer[i] = -1;
                    } else {
                        for (int j = i-1; j >= 0; j--) {
                            if (split[j].equals(split[i])) {
                                answer[i] = i - j;
                                break;
                            } else {
                                answer[i] = -1;
                                continue;
                            }
                        }
                    }
                }
            }
            return answer;
        }

        public static long countChar(String str, char ch) {
            return str.chars()
                    .filter(c -> c == ch)
                    .count();
        }
    }
}
