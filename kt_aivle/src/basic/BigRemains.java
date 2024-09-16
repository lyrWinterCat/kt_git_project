package basic;

import java.util.Scanner;

public class BigRemains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String scan = scanner.nextLine();

        int number = Integer.parseInt(scan);

        int five = number%5;
        int seven = number%7;

        int max = Math.max(five, seven);

        System.out.println(max);

        scanner.close();
    }
}
