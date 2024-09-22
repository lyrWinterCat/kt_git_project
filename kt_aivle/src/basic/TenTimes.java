package basic;

import java.util.Scanner;

public class TenTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        System.out.println(A*10);

        scanner.close();
    }
}
