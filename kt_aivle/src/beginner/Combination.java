package beginner;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        // 조합 계산
        int result = combination(A, B);

        // 출력
        System.out.println(result);

        scanner.close();
    }

    private static int combination(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }

        // 이항 계수 계산
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);

        return numerator / denominator;
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
