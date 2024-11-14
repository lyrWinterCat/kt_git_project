package basic;

import java.util.Scanner;

public class FengShuiBlessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 M 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        // 격자판 입력
        char[][] grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }

        int maxBlessing = 0;

        // 모든 가능한 직사각형 검사
        for (int r1 = 0; r1 < N; r1++) {
            for (int c1 = 0; c1 < M; c1++) {
                for (int r2 = r1; r2 < N; r2++) {
                    for (int c2 = c1; c2 < M; c2++) {
                        int blessing = calculateBlessing(grid, r1, c1, r2, c2);
                        maxBlessing = Math.max(maxBlessing, blessing);
                    }
                }
            }
        }

        // 최대 축복 출력
        System.out.println(maxBlessing);
    }

    // 주어진 직사각형의 축복을 계산하는 메서드
    private static int calculateBlessing(char[][] grid, int r1, int c1, int r2, int c2) {
        char firstChar = grid[r1][c1];
        int count = 0;

        // 직사각형의 각 칸을 검사
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                if (grid[i][j] == firstChar) {
                    count++;
                } else {
                    return 0; // 기운이 다르면 축복은 0
                }
            }
        }

        return count; // 모든 기운이 같으면 축복의 수 반환
    }
}
