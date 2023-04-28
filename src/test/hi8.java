package test;

import java.util.Arrays;

public class hi8 {

    public static void main(String[] args) {
        solution(new String[]{"a", "b", "c"});
    }

    public static String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        return answer.toString();

    }
}
