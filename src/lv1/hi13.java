package lv1;

// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
public class hi13 {

    public static void main(String[] args) {
        Pro13 pro13 = new Pro13();
        boolean solution1 = pro13.solution(10);
        boolean solution2 = pro13.solution(12);
        boolean solution3 = pro13.solution(11);
        boolean solution4 = pro13.solution(13);
        System.out.println("solution = " + solution1);
        System.out.println("solution = " + solution2);
        System.out.println("solution = " + solution3);
        System.out.println("solution = " + solution4);
    }

    static class Pro13 {
        public boolean solution(int x) {
            int sum = 0;
            int ori = x;
            while (x != 0) {
                sum += x % 10;
                x /= 10;
            }
            return ori % sum == 0;
        }
    }
}
