package lv1;

// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
public class hi14 {

    public static void main(String[] args) {
        Pro14 pro14 = new Pro14();
        long solution1 = pro14.solution(3, 5);
        long solution2 = pro14.solution(3, 3);
        long solution3 = pro14.solution(5, 3);
        System.out.println("solution = " + solution1);
        System.out.println("solution = " + solution2);
        System.out.println("solution = " + solution3);
    }

    static class Pro14 {
        public long solution(int a, int b) {
            long answer = 0;
            int tmp;
            if (b< a){
                tmp = b;
                b = a;
                a = tmp;
            }
            for (int i = a; i <= b; i++) {
                answer += i;
            }

            return answer;
        }
    }
}
