package skillTest.lv1;

public class Problem01 {

    public static void main(String[] args) {
        Pro01 pro01 = new Pro01();
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arr1 = new int[]{5, 5};
        double solution1 = pro01.solution(arr);
        double solution2 = pro01.solution(arr1);
        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }

    static class Pro01 {
        public double solution(int[] arr) {
            int total = 0;
            double answer = 0;
            for (int i : arr) {
                total += i;
            }
            answer = (double) total / arr.length;
            return answer;
        }
    }
}
