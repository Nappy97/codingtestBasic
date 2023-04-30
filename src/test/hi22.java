package test;

import java.util.Arrays;

public class hi22 {

    public static void main(String[] args) {
        int[] nl1 = new int[]{2, 1, 6};
        int[] nl2 = new int[]{5, 2, 1, 7, 5};
        pro22 pro22 = new pro22();
        int[] sol1 = pro22.pro22(nl1);
        int[] sol2 = pro22.pro22(nl2);
        System.out.println("sol1 = " + Arrays.toString(sol1));
        System.out.println("sol2 = " + Arrays.toString(sol2));
    }

    static class pro22 {
        public int[] pro22(int[] num_list) {
            int[] newArray = new int[num_list.length + 1];

            int answer = 0;
            for (int i = 0; i < num_list.length; i++) {
                newArray[i] = num_list[i];
                if (i == num_list.length - 1) {
                    if (newArray[i - 1] < num_list[i]) {
                        answer = num_list[i] - newArray[i - 1];
                    } else {
                        answer = num_list[i] * 2;
                    }
                }
            }

            newArray[num_list.length] = answer;

            return newArray;
        }
    }
}
