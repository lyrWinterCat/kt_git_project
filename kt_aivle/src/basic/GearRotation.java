package basic;

import java.util.Scanner;

public class GearRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 톱니 수 입력
        System.out.print("A, B, C의 톱니 수를 공백으로 구분하여 입력하세요: ");
        int N_A = scanner.nextInt();
        int N_B = scanner.nextInt();
        int N_C = scanner.nextInt();

        // C가 10바퀴 돌기 위해 A가 돌아야 하는 바퀴 수 계산
        int A_turns = calculateATurns(N_A, N_B, N_C, 10);

        // 결과 출력
        System.out.printf("C가 10바퀴 돌기 위해 A는 최소 %d 바퀴 돌아야 합니다.%n", A_turns);

        scanner.close();
    }

    public static int calculateATurns(int N_A, int N_B, int N_C, int target_C_turns) {
        // C가 target_C_turns 바퀴 돌기 위해 A가 돌아야 하는 바퀴 수 계산
        // C의 톱니 수에 비례하여 A의 톱니 수를 고려
        double turns = target_C_turns * (double) N_C / N_A;
        return (int) Math.ceil(turns); // 올림하여 정수로 반환
    }
}
