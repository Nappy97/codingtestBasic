package test;

import java.util.Scanner;

public class hi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] split = a.split("");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
