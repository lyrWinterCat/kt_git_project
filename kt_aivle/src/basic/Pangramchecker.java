package basic;

import java.util.HashSet;
import java.util.Scanner;

public class Pangramchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력 받기
        String input = scanner.nextLine();

        // 팬그램 확인을 위한 Set
        HashSet<Character> alphabetSet = new HashSet<>();

        // 문자열을 순회하며 알파벳 추가
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }

        // 팬그램 판단
        if (alphabetSet.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
