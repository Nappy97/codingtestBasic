package test;

public class hi15 {

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        String concat = ineq.concat(eq);

        if (eq.equals("!")) {
            concat = ineq;
        }

        boolean b = true;
        switch (concat) {
            case "<=":
                b = n <= m;
                break;

            case "<":
                b = n < m;
                break;

            case ">=":
                b = n >= m;

            case ">":
                b = n > m;

        }

        return b ? 1 : 0;

    }
}
