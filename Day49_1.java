/*
    한자리 숫자가 적힌 종이 조각이 흩어져있습니다.
    흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

    각 종이 조각에 적힌 숫자가 적힌 문자열 numbers 가 주어졌을 때,
    종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.HashSet;
import java.util.Set;

class Day49_1 {
    public int solution(String numbers) {
        Set<Integer> numberSet = new HashSet<>();
        int length = numbers.length();

        // 모든 순열 생성 (비트마스크를 사용하여 조합을 만듦)
        boolean[] visited = new boolean[length];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= length; i++) { // i는 생성할 숫자의 길이
            permute(numbers, visited, sb, numberSet, i);
        }

        // 소수 개수 세기
        int count = 0;
        for (int num : numberSet) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }

        return count;
    }

    private void permute(String numbers, boolean[] visited, StringBuilder sb, Set<Integer> numberSet, int length) {
        if (sb.length() == length) {
            numberSet.add(Integer.parseInt(sb.toString())); // 숫자로 변환하여 Set에 추가
            return;
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(numbers.charAt(i));

                permute(numbers, visited, sb, numberSet, length);

                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }
    }
}
