package test;

public class hi12 {

    public static void main(String[] args) {
        System.out.println(solution(98, 2));
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
