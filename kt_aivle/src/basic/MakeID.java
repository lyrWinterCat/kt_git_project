package basic;

import java.util.Scanner;

public class MakeID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 아이디 입력 받기
        String username = scanner.nextLine();

        // 아이디 유효성 검사
        if (isValidUsername(username)) {
            System.out.println("P"); // 유효한 아이디
        } else {
            System.out.println("I"); // 유효하지 않은 아이디
        }

        scanner.close();
    }

    // 아이디 유효성 검사 메소드
    public static boolean isValidUsername(String username) {
        // 길이 검사
        if (username.length() > 20) {
            return false;
        }

        // 각 문자 검사
        for (char c : username.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true; // 모든 조건을 통과한 경우
    }
}
