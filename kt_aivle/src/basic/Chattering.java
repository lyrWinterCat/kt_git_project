package basic;
import java.util.Scanner;

public class Chattering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 N과 K를 입력받기
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 두 번째 줄에서 문자열 입력받기
        String inputString = scanner.nextLine();

        // 결과 문자열을 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 각 문자에 대해 K회 반복하여 결과 문자열에 추가
        for (int i = 0; i < N; i++) {
            char currentChar = inputString.charAt(i);
            for (int j = 0; j < K; j++) {
                result.append(currentChar);
            }
        }

        // 결과 출력
        System.out.println(result.toString());
    }

}
