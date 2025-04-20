package personalTest;

public class MakeNodes {
    public int[] solution(int[] levels) {
        // 각 레벨별 노드 개수를 카운트
        int maxLevel = 0;
        int[] levelCount = new int[300001];  // 최대 레벨까지 저장 가능한 배열

        for (int level : levels) {
            levelCount[level]++;
            maxLevel = Math.max(maxLevel, level);
        }

        int deleteCount = 0;  // 삭제해야 할 노드 수
        int addCount = 0;     // 추가해야 할 노드 수

        // 각 레벨 검사
        for (int level = 1; level <= maxLevel; level++) {
            // 해당 레벨에 노드가 없는 경우
            if (levelCount[level] == 0) {
                addCount++;  // 최소 1개의 노드가 필요
                continue;
            }

            // 해당 레벨의 최대 노드 수
            int maxNodes = 1 << (level - 1);  // 2^(level-1)

            // 레벨에 있는 노드가 최대 개수를 초과하는 경우
            if (levelCount[level] > maxNodes) {
                deleteCount += levelCount[level] - maxNodes;
            }
        }

        return new int[]{deleteCount, addCount};
    }

    public static void main(String[] args) {
        MakeNodes sol = new MakeNodes();
        int[] levels = {1, 1, 1};  // 테스트 케이스

        int[] result = sol.solution(levels);
        System.out.println("삭제 횟수: " + result[0]);
        System.out.println("추가 횟수: " + result[1]);
    }
}
