package basic;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println(N*3.14);

        scanner.close();
    }
}
