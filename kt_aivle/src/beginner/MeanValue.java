package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class MeanValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5개의 정수를 입력받기
        System.out.println("5개의 정수를 입력하세요 (공백으로 구분):");
        String input = scanner.nextLine();

        // 공백 기준으로 문자열을 나누고 정수 배열로 변환
        String[] stringNumbers = input.split(" ");
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        // 배열 정렬
        Arrays.sort(numbers);

        // 중앙값 찾기 (5개 중 3번째 수)
        int median = numbers[2];

        System.out.println("중앙값은: " + median);

        scanner.close();
    }
}
