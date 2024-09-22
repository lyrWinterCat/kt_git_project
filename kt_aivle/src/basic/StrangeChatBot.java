package basic;

import java.util.Scanner;

public class StrangeChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if(input.equals("You")){
            System.out.println("Me");
        }else{
            System.out.println("No");
        }

        scanner.close();
    }
}
