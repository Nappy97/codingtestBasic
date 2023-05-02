package lv1;

import java.util.Arrays;
import java.util.Collections;

/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * */
public class hi12 {

    public static void main(String[] args) {
        Pro12 pro12 = new Pro12();
        long solution = pro12.solution(118372);
        System.out.println("solution = " + solution);

    }

    static class Pro12 {
        public long solution(long n) {
            String[] split = Long.toString(n).split("");
            Arrays.sort(split, Collections.reverseOrder());

            StringBuilder answ = new StringBuilder();
            for (String s : split) {
                answ.append(s);
            }

            return Long.parseLong(String.valueOf(answ));
        }
    }
}
