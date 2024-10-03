package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeHundreds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int[] digits = new int[N];
        for (int i = 0; i < N; i++) {
            digits[i] = scanner.nextInt();
        }

        // 300의 배수를 만들기 위한 조건 체크
        if (!canFormMultipleOf300(digits)) {
            System.out.println(-1);
            return;
        }

        // 정수들을 문자열로 변환 후 정렬
        Arrays.sort(digits);
        StringBuilder largestNumber = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            largestNumber.append(digits[i]);
        }

        // 결과 출력
        String result = largestNumber.toString();
        System.out.println(result);
    }

    private static boolean canFormMultipleOf300(int[] digits) {
        // 300의 배수 조건: 0이 반드시 있어야 하고, 3의 배수 조건을 만족해야 함
        int sum = 0;
        boolean hasZero = false;
        for (int digit : digits) {
            sum += digit;
            if (digit == 0) {
                hasZero = true;
            }
        }
        // 0이 없으면 300의 배수를 만들 수 없음
        if (!hasZero) {
            return false;
        }

        // 3의 배수 조건: 각 자리수의 합이 3의 배수여야 함
        return sum % 3 == 0;
    }
}
