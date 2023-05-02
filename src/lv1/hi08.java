package lv1;

public class hi08 {

    public static void main(String[] args) {
        Pro08 pro08 = new Pro08();
        boolean an1 = pro08.solution("pPoooyY");
        boolean an2 = pro08.solution("Pyy");
        boolean an3 = pro08.solution("aaaaa");
        System.out.println("an1 = " + an1);
        System.out.println("an2 = " + an2);
        System.out.println("an3 = " + an3);
    }

    static class Pro08 {
        boolean solution(String s) {
            String s1 = s.toLowerCase();
            int p = 0;
            int y = 0;
            int index = -1;
            while ((index = s1.indexOf("p", index + 1)) != -1) {
                p++;
            }
            index = -1;
            while ((index = s1.indexOf("y", index + 1)) != -1) {
                y++;
            }
            return p == y;
        }
    }
}
