package test;

public class hi20 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numL1 = new int[]{2, 3, 5, 2, 1};
        int[] numL2 = new int[]{5, 7, 8, 3};
        int solution1 = solution.solution(numL1);
        int solution2 = solution.solution(numL2);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }

    static class Solution {
        public int solution(int[] num_list) {
            int answer = 1;
            int answer1 = 0;
            for (int i = 0; i < num_list.length; i++) {
                answer = answer * num_list[i];
                answer1 += num_list[i];
            }
            int pow = (int) Math.pow(answer1, 2);

            return answer < pow ? 1 : 0;
        }
    }
}
