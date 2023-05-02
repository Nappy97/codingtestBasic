package lv1;

import java.util.Arrays;

public class hi04 {

    public static void main(String[] args) {
        Pro04 pro05 = new Pro04();
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arr1 = new int[]{5, 5};
        double solution = pro05.solution(arr);
        double solution1 = pro05.solution(arr1);
        System.out.println("solution = " + solution);
        System.out.println("solution1 = " + solution1);
    }

    static class Pro04 {
        public double solution(int[] arr) {
//            int sum = 0;
//            for (int i : arr) {
//                sum += i;
//            }
//            return (double) sum/arr.length;
            return (double) Arrays.stream(arr).average().orElse(0);
        }
    }
}
