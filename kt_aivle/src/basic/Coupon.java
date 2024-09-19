package basic;

import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 쿠폰 단위 배열 (내림차순으로 정렬)
        int[] coupons = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        // 거슬러줘야 할 금액 입력
        int N = scanner.nextInt();

        int count = 0; // 필요한 쿠폰 개수

        // 각 쿠폰 단위로 거슬러 줄 수 있는 최대 개수 계산
        for (int coupon : coupons) {
            if (N == 0) break; // 거슬러 줄 금액이 0이면 종료
            count += N / coupon; // 현재 쿠폰으로 거슬러 줄 수 있는 개수
            N %= coupon; // 남은 금액
        }

        // 결과 출력
        System.out.println(count);

        scanner.close();
    }
}
