package personalTest;

public class ArrRule {
    public int[][] solution(int[][] arr, int k) {
        for(int i = 0; i < k; i++) {
            // 1x1 배열이면 더 이상 변환하지 않음
            if(arr.length == 1 && arr[0].length == 1) break;

            arr = transform(arr);
        }
        return arr;
    }

    private int[][] transform(int[][] arr) {
        int n = arr.length;    // 세로 길이
        int m = arr[0].length; // 가로 길이

        // 가로 길이가 세로 길이보다 길거나 같은 경우
        if(m >= n) {
            int[][] result = new int[n][m/2];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j += 2) {
                    // 2개씩 묶어서 큰 값을 선택
                    result[i][j/2] = Math.max(arr[i][j], arr[i][j+1]);
                }
            }
            return result;
        }
        // 세로 길이가 가로 길이보다 긴 경우
        else {
            int[][] result = new int[n/2][m];
            for(int i = 0; i < n; i += 2) {
                for(int j = 0; j < m; j++) {
                    // 2개씩 묶어서 작은 값을 선택
                    result[i/2][j] = Math.min(arr[i][j], arr[i+1][j]);
                }
            }
            return result;
        }
    }
    private static void printArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrRule sol = new ArrRule();

        // 테스트 케이스
        int[][] arr = {
                {5, 4, 8, 7},
                {7, 3, 1, 2},
                {3, 8, 12, 6},
                {11, 4, 5, 4}
        };
        int k = 4;

        System.out.println("초기 배열:");
        printArray(arr);

        int[][] result = sol.solution(arr, k);

        System.out.println("최종 결과:");
        printArray(result);
    }
}
