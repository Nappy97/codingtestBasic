package lv1;

public class hi03 {

    public static void main(String[] args) {
        Pro03 pro03 = new Pro03();
        int solution1 = pro03.solution(12);
        int solution2 = pro03.solution(5);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }

    static class Pro03 {
        public int solution(int n) {
            int total = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i * i == n) total += i;
                    else total += i + (n / i);
                }
            }
            return total;
        }
    }
}
