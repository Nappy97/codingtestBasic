package lv1;

public class hi15 {
    public static void main(String[] args) {
        Pro15 pro15 = new Pro15();
        int solution1 = pro15.solution(6);
        int solution2 = pro15.solution(16);
        int solution3 = pro15.solution(626331);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }

    static class Pro15 {
        public int solution(int num) {
            int answer = 0;
            while (num == 1) {
                if (num % 2 == 0) {
                    num /= 2;
                    answer++;
                }
            }
            return answer;
        }
    }
}
