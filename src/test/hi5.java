package test;

import java.util.Scanner;

public class hi5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(n + " is ");
        System.out.println(n % 2 == 0 ? "even" : "odd");
    }
}
