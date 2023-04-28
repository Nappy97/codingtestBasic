package test;

public class hi6 {

    public static void main(String[] args) {
        String solution = solution("He11oWor1d", "lloWorl", 2);
        System.out.println(solution);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        int length = overwrite_string.length();
        int i = length + s;
        String substring = my_string.substring(s, i);
        return my_string.replace(substring, overwrite_string);
    }
}
