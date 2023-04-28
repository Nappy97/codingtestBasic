package test;

public class hi2 {

    public static void main(String[] args) {
        String str = "hello";
        int n = 5;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < n; i++) {
            a.append(str);
        }

        System.out.println(a);
    }
}
