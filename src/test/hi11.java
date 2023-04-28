package test;

public class hi11 {

    public static void main(String[] args) {
        System.out.println(solution(2, 91));
    }

    public static int solution(int a, int b) {
        String aS = String.valueOf(a);
        String bS = String.valueOf(b);
        int ab = Integer.parseInt(aS.concat(bS));

        int c = 2 * a * b;

        return Math.max(ab, c);
    }
}
