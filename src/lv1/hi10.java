package lv1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class hi10 {

    public static void main(String[] args) {
        Pro10 pro10 = new Pro10();
        System.out.println("answer = " + Arrays.toString(pro10.solution(12345)));

    }

    static class Pro10 {
        public int[] solution(long n) {
            return new StringBuilder(String.valueOf(n)).reverse().chars().map(Character::getNumericValue).toArray();
        }
    }
}
