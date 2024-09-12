package basic;

import java.util.Scanner;

public class AsciiConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        int number = scanner.nextInt();

        // 입력값이 범위 내인지 확인
        if (number >= 65 && number <= 90) {
            // ASCII 문자로 변환
            char asciiChar = (char) number;
            System.out.println(asciiChar);
        } else {
            System.out.println("입력값이 65 이상 90 이하가 아닙니다.");
        }

        scanner.close();
    }
}
