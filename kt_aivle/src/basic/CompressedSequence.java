package basic;

import java.util.Scanner;

public class CompressedSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 N과 M을 입력받음
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 두 번째 줄에서 N개의 정수를 입력받음
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 10 이상의 진법에서 시작
        for (int base = 10; base <= 62; base++) {
            int size = calculateSize(numbers, base, N);
            if (size <= M) {
                System.out.println(base);
                return;
            }
        }

        // 모든 진법에서 M 이하가 되지 않는 경우
        System.out.println(-1);
    }

    private static int calculateSize(int[] numbers, int base, int N) {
        int totalLength = 0;

        for (int number : numbers) {
            totalLength += getLengthInBase(number, base);
        }

        // 공백의 크기 추가
        totalLength += (N - 1);

        return totalLength;
    }

    private static int getLengthInBase(int number, int base) {
        int length = 0;

        // 숫자를 주어진 진법으로 변환하여 길이를 계산
        do {
            number /= base;
            length++;
        } while (number > 0);

        return length;
    }
}
