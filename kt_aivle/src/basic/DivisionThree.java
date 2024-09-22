package basic;

import java.util.Scanner;

public class DivisionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println(N%3);

        scanner.close();


    }
}
