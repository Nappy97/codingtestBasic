package test;

public class hi7 {

    public static void main(String[] args) {
        String solution = solution("aaaaa", "bbbbb");
        System.out.println(solution);
    }

    public static String solution(String str1, String str2) {
        String answer = "";

        String[] str1List = str1.split("");
        String[] str2List = str2.split("");

        for (int i = 0; i < str1List.length; i++) {
            answer += str1List[i] + str2List[i];
        }

        return answer;
    }
}
