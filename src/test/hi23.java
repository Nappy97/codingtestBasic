package test;

public class hi23 {

    public static void main(String[] args) {
        Pro23 pro23 = new Pro23();
        int result = pro23.pro23(0, "wsdawsdassw");
        System.out.println("result = " + result);
    }

    static class Pro23 {
        public int pro23(int n, String control) {
            int w = countChar(control, 'w');
            int s = countChar(control, 's');
            int d = countChar(control, 'd');
            int a = countChar(control, 'a');

            return n + w - s + (10 * d) - (10 * a);
        }

        public static int countChar(String str, char ch) {
            return (int) str.chars()
                    .filter(c -> c == ch)
                    .count();
        }
    }
}
