package basic;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        int answer = a+b+c;

        if(answer==180) {
            System.out.println("P");
        }else{
            System.out.println("F");
        }

        scanner.close();
    }
}
