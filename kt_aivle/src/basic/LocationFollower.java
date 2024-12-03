package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocationFollower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이동 횟수 N 입력
        int N = scanner.nextInt();
        int[][] positions = new int[N][2];

        // 좌표 입력
        for (int i = 0; i < N; i++) {
            positions[i][0] = scanner.nextInt(); // y좌표
            positions[i][1] = scanner.nextInt(); // x좌표
        }

        List<String> result = new ArrayList<>();

        // 이동 방향과 거리 계산
        for (int i = 1; i < N; i++) {
            int prevY = positions[i - 1][0];
            int prevX = positions[i - 1][1];
            int currY = positions[i][0];
            int currX = positions[i][1];

            int direction = 0;
            int distance = 0;

            // 이동 방향 결정
            if (currY > prevY) {
                direction = 1; // 북쪽
                distance = currY - prevY;
            } else if (currY < prevY) {
                direction = 3; // 남쪽
                distance = prevY - currY;
            } else if (currX > prevX) {
                direction = 2; // 동쪽
                distance = currX - prevX;
            } else if (currX < prevX) {
                direction = 4; // 서쪽
                distance = prevX - currX;
            }

            result.add(direction + " " + distance);
        }

        // 결과 출력
        for (String entry : result) {
            System.out.println(entry);
        }
    }
}
