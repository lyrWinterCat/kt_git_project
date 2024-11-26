package personalTest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MineGame {

    public class Solution {
        public int solution(int N, int[][] mine, int[] P) {
            boolean[][] board = new boolean[N][N];
            int[][] numbers = new int[N][N];

            // 지뢰 위치 설정
            for (int[] m : mine) {
                int x = m[0] - 1; // 0-indexed
                int y = m[1] - 1; // 0-indexed
                board[x][y] = true; // 지뢰가 있는 칸
                // 주변 칸의 숫자 증가
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i == 0 && j == 0) continue; // 자기 자신은 제외
                        int nx = x + i;
                        int ny = y + j;
                        if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                            numbers[nx][ny]++;
                        }
                    }
                }
            }

            // 플레이어가 처음 연 칸
            int startX = P[0] - 1; // 0-indexed
            int startY = P[1] - 1; // 0-indexed

            // 연쇄적으로 열리는 칸의 개수를 세기 위한 BFS
            return bfs(N, board, numbers, startX, startY);
        }

        private int bfs(int N, boolean[][] board, int[][] numbers, int startX, int startY) {
            if (board[startX][startY]) {
                return 0; // 지뢰가 있는 칸은 열 수 없음
            }

            Set<String> visited = new HashSet<>();
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{startX, startY});
            visited.add(startX + "," + startY); // 방문한 칸 기록
            int count = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                count++;

                // 현재 칸의 숫자가 0이라면 인접한 칸도 열기
                if (numbers[x][y] == 0) {
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            if (i == 0 && j == 0) continue; // 자기 자신은 제외
                            int nx = x + i;
                            int ny = y + j;
                            if (nx >= 0 && nx < N && ny >= 0 && ny < N && !board[nx][ny] && !visited.contains(nx + "," + ny)) {
                                visited.add(nx + "," + ny);
                                queue.offer(new int[]{nx, ny});
                            }
                        }
                    }
                }
            }

            return count; // 총 열린 칸의 수 반환
        }
    }

}
