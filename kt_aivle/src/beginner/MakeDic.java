package beginner;

import java.util.*;

public class MakeDic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개수 입력 후 다음 줄로 이동

        Set<String> wordsSet = new HashSet<>(); // 중복 제거를 위한 Set 사용

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            wordsSet.add(word); // Set에 단어 추가 (중복 제거)
        }

        List<String> wordsList = new ArrayList<>(wordsSet); // Set을 List로 변환
        // 길이 기준으로 정렬하고, 길이가 같으면 사전순으로 정렬
        Collections.sort(wordsList, Comparator.comparingInt(String::length).thenComparing(String::compareTo));

        for (String word : wordsList) {
            System.out.println(word); // 정렬된 단어 출력
        }

        scanner.close();
    }
}
