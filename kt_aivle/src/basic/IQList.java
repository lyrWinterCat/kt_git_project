package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IQList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수 입력
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 학생 정보를 저장할 리스트
        List<Student> students = new ArrayList<>();

        // 학생 이름과 IQ 입력
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            int iq = Integer.parseInt(parts[1]);
            students.add(new Student(name, iq));
        }

        // IQ 기준으로 정렬 (내림차순)
        students.sort((s1, s2) -> {
            if (s2.iq != s1.iq) {
                return Integer.compare(s2.iq, s1.iq); // IQ가 다르면 내림차순 정렬
            }
            return 0; // IQ가 같으면 입력 순서 유지
        });

        // 상위 3명의 이름 출력
        for (int i = 0; i < 3; i++) {
            System.out.println(students.get(i).name);
        }

        scanner.close();
    }

    // 학생 정보를 저장할 클래스
    static class Student {
        String name;
        int iq;

        Student(String name, int iq) {
            this.name = name;
            this.iq = iq;
        }
    }
}

