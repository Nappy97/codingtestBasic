package lv1;

public class hi11 {

    public static void main(String[] args) {
        Pro11 pro11 = new Pro11();
        int solution1 = pro11.solution("1234");
        int solution2 = pro11.solution("-1234");
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }

    static class Pro11 {
        public int solution(String s) {
            return Integer.parseInt(s);
        }
    }
}
