package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class hi21 {

    public static void main(String[] args) {
        int[] numL1 = new int[]{3, 4, 5, 2, 1};
        int[] numL2 = new int[]{5, 7, 8, 3};
        pro21 pro21 = new pro21();
        int i = pro21.pro21(numL1);
        int i1 = pro21.pro21(numL2);
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
    }

    static class pro21 {
        public int pro21(int[] numList) {
//            StringBuffer odd = new StringBuffer();
//            StringBuffer even = new StringBuffer();
//            for (int i : num_list) {
//                if (i % 2 == 1) {
//                    odd.append(i);
//                } else {
//                    even.append(i);
//                }
//            }
//
//            int i = Integer.parseInt(String.valueOf(odd)) + Integer.parseInt(String.valueOf(even));
//
//            return i;
            return Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));

        }
    }
}
