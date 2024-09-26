package beginner;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄 입력 처리
        int N = scanner.nextInt();
        int A = scanner.nextInt();

        // 정수 배열 선언 및 입력 처리
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 이진 탐색을 통해 A 찾기
        int index = binarySearch(numbers, A);
        System.out.println(index);

        scanner.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid + 1; // 1-based index
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // A를 찾을 수 없을 때
    }
}
