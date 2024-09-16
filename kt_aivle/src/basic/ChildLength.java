package basic;

import java.util.Scanner;

public class ChildLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int firstNumber = Integer.parseInt(numbers[0]);
        int secondNumber = Integer.parseInt(numbers[1]);

        System.out.println((firstNumber+secondNumber)/2);
        scanner.close();

    }
}
