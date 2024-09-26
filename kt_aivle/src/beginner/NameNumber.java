package beginner;

import java.util.Scanner;

public class NameNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄 입력 처리
        int N = scanner.nextInt();
        String yeongdeokName = scanner.next();

        // 둘째 줄 입력 처리
        String[] names = new String[N];
        for (int i = 0; i < N; i++) {
            names[i] = scanner.next();
        }

        // 영덕이의 이름을 찾기
        for (int i = 0; i < N; i++) {
            if (names[i].equals(yeongdeokName)) {
                // 인덱스는 0부터 시작하므로 +1
                System.out.println(i + 1);
                break;
            }
        }

        scanner.close();
    }
}
