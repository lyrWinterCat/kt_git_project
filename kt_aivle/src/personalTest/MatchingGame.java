package personalTest;

public class MatchingGame {
    public int solution(String[][] rounds) {
        int violations = 0;

        // 이전 라운드 커플 정보를 저장할 배열 (인덱스는 0:a, 1:b, 2:c, 3:d)
        int[] lastCouples = new int[4]; // -1로 초기화하면 커플이 없음을 의미
        for(int i = 0; i < 4; i++) lastCouples[i] = -1;

        // 각 라운드 처리
        for(int round = 0; round < rounds.length; round++) {
            String[] currentRound = rounds[round];

            // 현재 라운드의 커플 정보를 저장할 배열
            int[] currentCouples = new int[4];
            for(int i = 0; i < 4; i++) currentCouples[i] = -1;

            // 각 참가자의 선택 검사
            for(int person = 0; person < 4; person++) {
                char choice = currentRound[person].charAt(0);
                int choiceIndex = choice - 'a';

                // 규칙 위반 체크
                // 1. 자기 자신을 지목한 경우
                if(person == choiceIndex) {
                    violations++;
                    continue;
                }

                // 2. 직전 라운드 커플을 지목한 경우
                if(round > 0 && lastCouples[person] == choiceIndex) {
                    violations++;
                    continue;
                }

                // 커플 매칭 체크 (상대방도 나를 선택했는지)
                if(currentRound[choiceIndex].charAt(0) - 'a' == person) {
                    currentCouples[person] = choiceIndex;
                    currentCouples[choiceIndex] = person;
                }
            }

            // 이전 라운드 커플 정보 업데이트
            lastCouples = currentCouples;
        }

        return violations;
    }

    public static void main(String[] args) {
        MatchingGame sol = new MatchingGame();
        String[][] rounds = {
                {"b", "a", "a", "d"},
                {"b", "c", "a", "c"},
                {"b", "a", "d", "c"}
        };

        System.out.println("규칙 위반 횟수: " + sol.solution(rounds));
    }
}
