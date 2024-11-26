package personalTest;

import java.util.HashSet;

public class MakeSquare {
    public int solution(String[] grid, int t) {
        int n = grid.length;
        int maxK = 0;

        // 가능한 K의 범위를 확인
        for (int k = 2; k <= n - 1; k++) {
            if (n % k == 0) { // K가 N의 약수일 때만
                if (canCut(grid, n, k, t)) {
                    maxK = k; // 조건을 만족하면 최대 K 업데이트
                }
            }
        }

        return maxK; // 가장 큰 K 반환
    }

    private boolean canCut(String[] grid, int n, int k, int t) {
        for (int i = 0; i < n; i += k) {
            for (int j = 0; j < n; j += k) {
                if (!checkSquare(grid, i, j, k, t)) {
                    return false; // 하나라도 조건을 만족하지 않으면 false 반환
                }
            }
        }
        return true; // 모든 정사각형이 조건을 만족하면 true 반환
    }

    private boolean checkSquare(String[] grid, int startX, int startY, int k, int t) {
        HashSet<Character> uniqueChars = new HashSet<>();

        for (int i = startX; i < startX + k; i++) {
            for (int j = startY; j < startY + k; j++) {
                uniqueChars.add(grid[i].charAt(j));
            }
        }

        return uniqueChars.size() <= t; // 유니크 알파벳 개수가 t 이하인지 확인
    }
}
