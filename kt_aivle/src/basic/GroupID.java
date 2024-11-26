package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GroupID {
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N(사람 수)과 M(친구 관계 수) 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 친구 관계 입력
        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[N + 1];
        int maxSize = 0;
        int groupId = Integer.MAX_VALUE;

        // 각 그룹을 찾기
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                List<Integer> group = new ArrayList<>();
                dfs(i, group);

                // 그룹 크기와 ID 확인
                if (group.size() > maxSize) {
                    maxSize = group.size();
                    groupId = Collections.min(group);
                } else if (group.size() == maxSize) {
                    groupId = Math.min(groupId, Collections.min(group));
                }
            }
        }

        // 결과 출력
        System.out.println(groupId);
    }
    // DFS를 통해 그룹 구성원 찾기
    static void dfs(int node, List<Integer> group) {
        visited[node] = true;
        group.add(node);
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, group);
            }
        }
    }

}
