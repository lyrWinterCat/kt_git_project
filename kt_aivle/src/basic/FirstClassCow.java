package basic;

import java.util.Scanner;

public class FirstClassCow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String scan = scanner.nextLine();

        int cow = Integer.parseInt(scan);

        String result;

        if (cow >= 200) {
            result = "A";
        } else if (cow >= 180) {
            result = "B";
        } else if (cow >= 150) {
            result = "C";
        } else {
            result = "D";
        }


        System.out.println(result);
        scanner.close();
    }
}
