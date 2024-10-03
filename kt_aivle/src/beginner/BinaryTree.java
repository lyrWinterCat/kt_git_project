package beginner;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }

        // 누적 합 계산
        int[] tree = new int[2 * N - 1];
        buildCumulativeSumTree(tree, values, 0, 0, N);

        // 출력
        printTree(tree, N);

        scanner.close();
    }
    private static int buildCumulativeSumTree(int[] tree, int[] values, int nodeIndex, int start, int end) {
        if (start >= end) {
            return 0;
        }
        if (start == end - 1) {
            tree[nodeIndex] = values[start];
            return values[start];
        }

        int mid = (start + end) / 2;
        int leftSum = buildCumulativeSumTree(tree, values, 2 * nodeIndex + 1, start, mid);
        int rightSum = buildCumulativeSumTree(tree, values, 2 * nodeIndex + 2, mid, end);

        tree[nodeIndex] = leftSum + rightSum;
        return tree[nodeIndex];
    }
    private static void printTree(int[] tree, int N) {
        int height = (int) Math.ceil(Math.log(N) / Math.log(2));
        int maxNodes = (int) Math.pow(2, height) - 1;

        for (int i = 0; i < maxNodes; i++) {
            if (i < tree.length) {
                System.out.print(tree[i] + " ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}
