package basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CalendarInk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 요일 입력 받기
        String firstDay = scanner.nextLine();
        int firstDayIndex = getFirstDayIndex(firstDay);

        // 공휴일 수 입력 받기
        int N = Integer.parseInt(scanner.nextLine());
        Set<String> holidays = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            holidays.add(month + " " + day);
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] colorCounts = new int[10][3]; // 0: red, 1: blue, 2: black

        // 달력 색상 계산
        for (int month = 1; month <= 12; month++) {
            for (int day = 1; day <= daysInMonth[month]; day++) {
                int dayOfWeek = (firstDayIndex + (day - 1)) % 7;
                String date = month + " " + day;
                int color = 2; // 기본적으로 검은색

                // 일요일
                if (dayOfWeek == 0) {
                    color = 0; // 빨간색
                }
                // 토요일
                else if (dayOfWeek == 6) {
                    color = 1; // 파란색
                }
                // 공휴일
                if (holidays.contains(date)) {
                    color = 0; // 빨간색 (주문 공휴일)
                }

                // 숫자 카운트 증가
                countDigits(day, colorCounts, color);
            }
            // 첫째 날의 요일 업데이트
            firstDayIndex = (firstDayIndex + daysInMonth[month]) % 7;
        }

        // 결과 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(colorCounts[i][0] + " " + colorCounts[i][1] + " " + colorCounts[i][2]);
        }

        scanner.close();
    }

    private static int getFirstDayIndex(String firstDay) {
        switch (firstDay) {
            case "SUN": return 0;
            case "MON": return 1;
            case "TUE": return 2;
            case "WED": return 3;
            case "THU": return 4;
            case "FRI": return 5;
            case "SAT": return 6;
            default: return -1;
        }
    }

    private static void countDigits(int day, int[][] colorCounts, int color) {
        String dayStr = String.valueOf(day);
        for (char digit : dayStr.toCharArray()) {
            int digitIndex = digit - '0';
            colorCounts[digitIndex][color]++;
        }
    }
}
