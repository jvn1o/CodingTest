/*
    정수 배열 arr 와 query 가 주어집니다.

    query 를 순회하면서 다음 작업을 반복합니다.

    짝수 인덱스에서는 arr 에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
    홀수 인덱스에서는 arr 에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
    위 작업을 마친 후 남은 arr 의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
*/

import java.util.*;

class Day31_1 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            answer.add(num);
        }

        for (int i = 0; i < query.length; i++) {
            int q = query[i];
            if (i % 2 == 0) {
                answer = new ArrayList<>(answer.subList(0, q + 1));
            } else {
                answer = new ArrayList<>(answer.subList(q, answer.size()));
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
