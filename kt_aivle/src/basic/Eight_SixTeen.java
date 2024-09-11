package basic;

import java.io.IOException;
import java.util.Scanner;

public class Eight_SixTeen {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // 10진수 정수 N 입력 받기
        int N = scanner.nextInt();

        // 8진수 변환
        String octal = Integer.toOctalString(N);

        // 16진수 변환 (대문자)
        String hexadecimal = Integer.toHexString(N).toUpperCase();

        // 결과 출력
        System.out.println(octal + " " + hexadecimal);

        scanner.close();

    }
}
