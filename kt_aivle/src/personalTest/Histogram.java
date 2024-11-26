package personalTest;

public class Histogram {
    public int solution(int[][] histogram) {
        int rows = histogram.length;
        int cols = histogram[0].length;
        int totalCount = 1;

        for (int j = 0; j < cols; j++) {
            int maxHeight = 0; // 현재 열의 최대 높이
            boolean isDamaged = false; // 손상된 부분 존재 여부

            // 각 열에 대한 최대 높이 및 손상 체크
            for (int i = 0; i < rows; i++) {
                if (histogram[i][j] == 1) {
                    maxHeight++;
                } else if (histogram[i][j] == 2) {
                    isDamaged = true; // 손상된 부분 발견
                }
            }

            // 막대의 높이를 결정
            if (isDamaged) {
                // 손상된 경우, 가능한 높이 수 계산
                int possibleHeights = 0;
                for (int h = 0; h <= maxHeight; h++) {
                    boolean valid = true;
                    for (int i = 0; i < rows; i++) {
                        if (histogram[i][j] == 2 && i < rows - h) {
                            valid = false; // 손상된 부분 아래에 막대가 존재할 수 없음
                            break;
                        }
                    }
                    if (valid) {
                        possibleHeights++;
                    }
                }
                totalCount *= possibleHeights; // 총 경우의 수에 곱함
            } else {
                // 손상이 없을 경우, 높이 0부터 maxHeight까지
                totalCount *= (maxHeight + 1);
            }
        }

        return totalCount; // 가능한 경우의 수 반환
    }
}
