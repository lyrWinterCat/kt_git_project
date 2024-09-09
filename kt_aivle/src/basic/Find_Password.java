package basic;

// don't place package name.

import java.io.*;

import java.util.*;

public class Find_Password {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        StringBuilder password = new StringBuilder();

        while (true) {
            String input = scanner.next();
            password.append(input).append(" ");

            if (input.equals("c")) {
                break; // 'c'가 입력되면 루프 종료
            }
        }

        System.out.println(password.toString().trim()); // 마지막 공백 제거 후 출력
        scanner.close();

    }

}
// don't change 'Main' class name and  'public' accessor.


