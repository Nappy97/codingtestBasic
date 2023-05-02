package lv1;

public class hi05 {

    public static void main(String[] args) {
        Pro05 pro05 = new Pro05();
        int solution1 = pro05.solution(123);
        int solution2 = pro05.solution(987);
        System.out.println(solution1);
        System.out.println(solution2);
    }

    static public class Pro05 {
        public int solution(int n) {
            int answer = 0;

            while (n > 0) {
                answer += n % 10;
                n /= 10;
            }

            return answer;
        }
    }
}
