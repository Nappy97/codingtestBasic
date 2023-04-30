package test;

public class hi19 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(2, 6, 1);
        int solution2 = solution.solution(5, 3, 3);
        int solution3 = solution.solution(4, 4, 4);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);
    }

    static class Solution {
        public int solution(int a, int b, int c) {
            int x = (a + b + c);
            int y = x * (a * a + b * b + c * c);
            int z = y * (a * a * a + b * b * b + c * c * c);
            return (a != b && b != c && a != c) ? x :
                    ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) ? y : z;
        }
    }
}


