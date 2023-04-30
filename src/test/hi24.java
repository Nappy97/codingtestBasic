package test;

public class hi24 {

    public static void main(String[] args) {
        int[] numList = new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        Pro24 pro24 = new Pro24();
        String s = pro24.pro24(numList);
        System.out.println("s = " + s);
    }

    static class Pro24 {
        public String pro24(int[] numLong) {
            StringBuilder sb = new StringBuilder();
            int x;
            for (int i = 0; i < numLong.length; i++) {
                if (i >= 1) {
                    x = numLong[i] - numLong[i - 1];
                    if (x == 1) {
                        sb.append("w");
                    } else if (x == -1) {
                        sb.append("s");
                    } else if (x == 10) {
                        sb.append("d");
                    } else {
                        sb.append("a");
                    }
                }
            }

            return sb.toString();
        }
    }
}

