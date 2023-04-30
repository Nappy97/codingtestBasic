package test;

public class hi18 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean[] included1 = new boolean[]{true, false, false, true, true};
        boolean[] included2 = new boolean[]{false, false, false, true, false, false, false};
        int solution1 = solution.solution(3, 4, included1);
        int solution2 = solution.solution(7, 1, included2);
        System.out.println(solution1);
        System.out.println(solution2);
    }

    static class Solution {
        public int solution(int a, int d, boolean[] included) {
            int answer = 0;
            for (int i = 0; i < included.length; i++) {
                if (included[i]) {
                    answer += a;
                }
                a = a + d;
            }

            return answer;
        }
    }
}


