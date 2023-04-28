package test;

import java.util.Objects;

public class hi17 {

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }

    public static String solution(String code) {
        StringBuilder answer = new StringBuilder();
        //ture == 0 , false == 1
        boolean mode = true;
        String[] split = code.split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("1"))
                mode = !mode;
            if (mode) {
                if (i % 2 == 0 && !split[i].equals("1")) {
                    answer.append(split[i]);
                }
            } else if (!mode) {
                if (i % 2 != 0 && !split[i].equals("1")) {
                    answer.append(split[i]);
                }
            }
        }
        if (answer.toString().equals(""))
            answer = new StringBuilder("EMPTY");
        return answer.toString();
    }
}
