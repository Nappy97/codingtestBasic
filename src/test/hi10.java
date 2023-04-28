package test;

public class hi10 {

    public static void main(String[] args) {
        System.out.println(solution(9, 91));
    }

    public static int solution(int a, int b) {
        String aS = String.valueOf(a);
        String bS = String.valueOf(b);
        int ab = Integer.parseInt(aS.concat(bS));
        int ba = Integer.parseInt(bS.concat(aS));

        return Math.max(ab, ba);
    }
}
