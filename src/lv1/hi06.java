package lv1;

public class hi06 {

    public static void main(String[] args) {
        Pro06 pro06 = new Pro06();
        int solution1 = pro06.solution(10);
        int solution2 = pro06.solution(12);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }

    static class Pro06 {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 1){
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
