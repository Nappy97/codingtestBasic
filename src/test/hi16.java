package test;

public class hi16 {

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
