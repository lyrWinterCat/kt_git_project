package basic;

import java.util.Scanner;

public class RimboGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 림보의 개수 N 입력 받기
        int N = scanner.nextInt();

        // 건혁이의 최대 허리 젖힌 키
        int maxBendHeight = 160;

        // 림보의 높이 배열
        int[] limboHeights = new int[N];

        // 림보의 높이 입력 받기
        for (int i = 0; i < N; i++) {
            limboHeights[i] = scanner.nextInt();
        }

        // 림보 통과 여부 판단
        for (int height : limboHeights) {
            if (height <= maxBendHeight) {
                System.out.println("I " + height);
                return; // 첫 번째로 부딪힌 높이를 출력하고 종료
            }
        }

        // 모든 림보를 통과한 경우
        System.out.println("P");

        scanner.close();
    }
}
