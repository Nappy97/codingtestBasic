package test;

public class hi14 {

    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0 && i % 2 == 0) {
                answer += i * i;
            } else if (n % 2 == 1 && i % 2 == 1) {
                answer += i;
            }
        }

        return answer;
    }
}
