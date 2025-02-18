/*
    정수 리스트 num_list 와 정수 n이 주어질 때,
    n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.*;

class Day31_2 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
