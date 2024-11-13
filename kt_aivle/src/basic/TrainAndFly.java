package basic;

import java.util.Scanner;

public class TrainAndFly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 값 받기
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int X = Integer.parseInt(values[0]); // 기차 사이의 거리 (킬로미터)
        int Y = Integer.parseInt(values[1]); // 기차의 속도 (킬로미터/시)
        int Z = Integer.parseInt(values[2]); // 파리의 속도 (킬로미터/시)

        // 두 기차가 충돌하는 시간 계산
        double timeToCollision = (double) X / (Y + Y); // 두 기차 속도의 합으로 충돌 시간 계산

        // 파리가 이동한 거리 계산
        int distanceFly = (int) (Z * timeToCollision); // 거리 = 속도 * 시간

        // 결과 출력
        System.out.println(distanceFly);

        scanner.close();
    }
}
