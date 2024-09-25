package basic;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 공백으로 구분된 두 정수 입력
        System.out.print("두 개의 정수를 입력하세요 (예: 124 152): ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        // 최대공약수 계산
        int gcd = findGCD(a, b);

        System.out.println("최대공약수: " + gcd);

        scanner.close();
    }

    // 유클리드 알고리즘을 이용한 최대공약수 계산
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
