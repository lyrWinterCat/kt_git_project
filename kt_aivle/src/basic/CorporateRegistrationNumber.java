package basic;

import java.util.Scanner;

public class CorporateRegistrationNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String classificationCode = scanner.nextLine().trim(); // 등기관서별 분류번호
        String serialNumber = scanner.nextLine().trim();       // 일련번호
        String errorCheckNumber = scanner.nextLine().trim();   // 오류검색번호

        // 앞 12자리 생성
        String first12Digits = classificationCode + serialNumber;

        // 오류검색번호 계산
        int A = 0; // 홀수 번째 수의 합
        int B = 0; // 짝수 번째 수의 합

        // 앞 12자리 수를 순회하며 A와 B 계산
        for (int i = 0; i < first12Digits.length(); i++) {
            int digit = Character.getNumericValue(first12Digits.charAt(i));
            if ((i + 1) % 2 != 0) { // 홀수 번째 수
                A += digit;
            } else { // 짝수 번째 수
                B += digit;
            }
        }

        int R = (2 * B + A) % 10;
        int calculatedErrorCheckNumber = (10 - R) % 10;

        // 입력된 오류검색번호와 계산된 오류검색번호 비교
        if (calculatedErrorCheckNumber != Integer.parseInt(errorCheckNumber)) {
            System.out.println("입력된 오류검색번호가 올바르지 않습니다.");
            return;
        }

        // 법인 종류별 분류번호 추출
        int corporationTypeCode = Integer.parseInt(classificationCode.substring(0, 2));

        // 결과 문자열 초기화
        StringBuilder result = new StringBuilder("XXXXX");

        // 법인 종류 판단
        if (corporationTypeCode >= 11 && corporationTypeCode <= 15) {
            result.setCharAt(0, 'O'); // 상업 법인
        } else {
            result.setCharAt(0, 'X');
        }

        if (corporationTypeCode >= 21 && corporationTypeCode <= 22) {
            result.setCharAt(1, 'O'); // 민법 법인
        } else {
            result.setCharAt(1, 'X');
        }

        if (corporationTypeCode >= 31 && corporationTypeCode <= 51) {
            result.setCharAt(2, 'O'); // 특수 법인
        } else {
            result.setCharAt(2, 'X');
        }

        if (corporationTypeCode >= 81 && corporationTypeCode <= 86) {
            result.setCharAt(3, 'O'); // 외국 법인
        } else {
            result.setCharAt(3, 'X');
        }

        if (corporationTypeCode == 71) {
            result.setCharAt(4, 'O'); // 기타 법인
        } else {
            result.setCharAt(4, 'X');
        }

        // 결과 출력
        System.out.println(result.toString());

        scanner.close();
    }
}
