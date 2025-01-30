/*
    정수 n과 정수 배열 num list 가 매개변수로 주어질 때,
    numlist 에서 n의 배수가 아닌 수들을 제거한 배열을 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.*;

public class Day12_3 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for (int i : numlist) {
            if (i % n == 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
