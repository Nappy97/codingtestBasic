package test;

import java.util.Arrays;

public class hi25 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int[][] queries = new int[][]{{0, 3}, {1, 2}, {1, 4}};
        pro25 pro25 = new pro25();
        int[] ints = pro25.pro25(arr, queries);
        System.out.println("ints = " + Arrays.toString(ints));
    }

    static class pro25 {
        public int[] pro25(int[] arr, int[][] queries) {
            int[] answer = arr;
            int tmp;
            for (int i = 0; i < queries.length; i++) {
                int[] query = queries[i];
                for (int j = 0; j < query.length; j++) {
                    if (j % 2 == 1) {
                        tmp = answer[query[j - 1]];
                        answer[query[j - 1]] = answer[query[j]];
                        answer[query[j]] = tmp;
                    }
                }
            }

            return answer;
        }
    }
}
