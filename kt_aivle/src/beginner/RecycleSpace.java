package beginner;

import java.util.Scanner;

public class RecycleSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] apartments = new int[N][2]; // 위치와 인구 수 저장

        for (int i = 0; i < N; i++) {
            apartments[i][0] = scanner.nextInt(); // D[i]
            apartments[i][1] = scanner.nextInt(); // A[i]
        }

        // 거리의 합을 저장할 변수
        long minDistanceSum = Long.MAX_VALUE;
        int bestIndex = -1;

        // 각 아파트 단지에 대해 거리의 합을 계산
        for (int i = 0; i < N; i++) {
            long distanceSum = 0;

            for (int j = 0; j < N; j++) {
                distanceSum += Math.abs(apartments[i][0] - apartments[j][0]) * apartments[j][1];
            }

            // 최소 거리 합 갱신
            if (distanceSum < minDistanceSum) {
                minDistanceSum = distanceSum;
                bestIndex = i + 1; // 1-based index
            }
        }

        System.out.println(bestIndex);
    }
}
