package basic;

import java.util.Scanner;

public class ArithmeticSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기 (한 줄로 A, B, N을 공백으로 구분)
        System.out.print("입력 (A B N): ");
        String input = scanner.nextLine();
        String[] values = input.split(" "); // 공백으로 분리

        // A, B, N 값 파싱
        int A = Integer.parseInt(values[0]); // 첫째 항
        int B = Integer.parseInt(values[1]); // 두 항의 차이
        int N = Integer.parseInt(values[2]); // 몇 번째 항

        // N번째 항 계산
        int nthTerm = A + (N - 1) * B;

        // 결과 출력
        System.out.println(nthTerm);

        scanner.close();
    }
}
