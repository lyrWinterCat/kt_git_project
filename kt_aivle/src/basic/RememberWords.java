package basic;

import java.util.Scanner;

public class RememberWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄에 세 정수 A, B, N 입력 받기
        int A = scanner.nextInt(); // 하루에 외우는 단어 수
        int B = scanner.nextInt(); // 밤에 까먹는 단어 수
        int N = scanner.nextInt(); // 외워야 할 총 단어 수

        // 총 일수 계산
        int days = 0;
        int memorizedWords = 0;

        while (memorizedWords < N) {
            days++; // 하루가 지남
            memorizedWords += A; // 하루에 A개 외우기

            // 만약 외운 단어가 N을 초과하면 N으로 설정
            if (memorizedWords > N) {
                memorizedWords = N;
            }

            // 외운 단어가 N에 도달하면 종료
            if (memorizedWords == N) {
                break;
            }

            // 밤에 B개 까먹기
            memorizedWords -= B;
            if (memorizedWords < 0) {
                memorizedWords = 0; // 까먹는 단어가 외운 단어보다 많으면 0으로 설정
            }
        }

        // 결과 출력
        System.out.println(days);

        scanner.close();
    }
}
