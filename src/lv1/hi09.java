package lv1;

public class hi09 {

    public static void main(String[] args) {
        Pro09 pro09 = new Pro09();
        long solution1 = pro09.solution(121);
        long solution2 = pro09.solution(3);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }

    static class Pro09 {
        public long solution(long n) {
            double sqrt = Math.sqrt(n);
            return sqrt != Math.floor(sqrt) ? -1 : (long) Math.pow(sqrt + 1, 2);
        }
    }
}
