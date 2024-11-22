package basic;

import java.util.Scanner;

public class PhoneNumberValidater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 전화번호 입력
        System.out.print("전화번호를 입력하세요 (형식: 000-0000-0000): ");
        String phoneNumber = scanner.nextLine();

        // 전화번호 검증
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        scanner.close();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // 정규 표현식 패턴
        String regex = "^010-\\d{4}-\\d{4}$";
        return phoneNumber.matches(regex);
    }
}
