package lv1;

public class hi02 {

    public static void main(String[] args) {
        Pro02 pro01 = new Pro02();
        String solution1 = pro01.solution(3);
        String solution2 = pro01.solution(4);
        String solution3 = pro01.solution(0);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }

    static class Pro02 {
        public String solution(int num) {
            return num % 2 == 0 ? "Even" : "Odd";
        }
    }
}
