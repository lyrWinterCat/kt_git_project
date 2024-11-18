package basic;

import java.util.Scanner;

public class GearRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 톱니 수 입력 받기
        int A = scanner.nextInt(); // A 톱니바퀴의 톱니 수
        int B = scanner.nextInt(); // B 톱니바퀴의 톱니 수
        int C = scanner.nextInt(); // C 톱니바퀴의 톱니 수

        // C가 10바퀴 도는 데 필요한 A의 회전 수 계산
        // C의 회전 수 = (A의 회전 수 * A의 톱니 수) / B의 톱니 수
        // C가 10바퀴 도는 경우: 10 = (A의 회전 수 * A) / B
        // => A의 회전 수 = (10 * B) / A
        // A의 회전 수는 정수여야 하므로 올림 처리 필요

        int rotationsForC = 10;
        int requiredRotationsA = (rotationsForC * B + A - 1) / A; // 올림 처리

        // 결과 출력
        System.out.println(requiredRotationsA);

        scanner.close();
    }
}
