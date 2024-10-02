import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 N 입력 받기
        System.out.print("N의 값을 입력하세요: ");
        int N = scanner.nextInt();

        // 0부터 9까지의 숫자 카운트 배열
        int[] count = new int[10];

        // 1부터 N까지의 숫자를 문자열로 변환하여 카운트
        for (int i = 1; i <= N; i++) {
            String number = String.valueOf(i);
            for (char digit : number.toCharArray()) {
                count[digit - '0']++; // 문자 '0'의 아스키 코드 값을 빼서 인덱스 생성
            }
        }

        // 결과 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(count[i] + " ");
        }

        scanner.close();
    }
}
