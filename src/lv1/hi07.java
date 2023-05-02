package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.LongStream;

public class hi07 {

    public static void main(String[] args) {
        Pro07 pro07 = new Pro07();
        long[] solution1 = pro07.solution(2, 5);
        long[] solution2 = pro07.solution(4,3);
        long[] solution3 = pro07.solution(-4,2);
        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }

    static class Pro07 {
        public long[] solution(int x, int n) {
//            long[] answer = new long[n];
//            for (int i = 0; i < n; i++) {
//                answer[i] = (long) x * (i + 1);
//            }
//            return answer;

            return LongStream.rangeClosed(1, n)
                    .map(i -> (long) x * i)
                    .toArray();
        }
    }
}
