package basic;

import java.util.Scanner;

public class GivePresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 선물 종류 수 N 입력
        int N = scanner.nextInt();
        int[] gifts = new int[N];

        // 각 종류의 선물 개수 입력
        for (int i = 0; i < N; i++) {
            gifts[i] = scanner.nextInt();
        }

        // 최대 아이 수를 찾기 위한 이진 탐색
        int left = 1; // 최소 1명
        int right = 0;

        // right 초기화: 모든 선물의 개수를 합산
        for (int gift : gifts) {
            right += gift;
        }

        int maxKids = 0;

        while (left <= right) {
            int mid = (left + right) / 2; // 현재 시도하는 아이 수
            long totalGifts = 0;

            // 각 선물의 개수를 mid로 나누어 가능한 총 개수 계산
            for (int gift : gifts) {
                totalGifts += gift / mid; // 아이당 선물 수
            }

            // 만약 가능한 선물 수가 mid보다 크거나 같다면
            if (totalGifts >= mid) {
                maxKids = mid; // 최대 아이 수 업데이트
                left = mid + 1; // 더 많은 아이에게 나누어 주기 위해 탐색
            } else {
                right = mid - 1; // 아이 수를 줄여서 다시 탐색
            }
        }

        // 결과 출력
        System.out.println(maxKids);
    }
}

