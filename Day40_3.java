/*
    정수로 이루어진 리스트 num_list 가 주어집니다.
    num_list 에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Day40_3 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        List<Integer> answer = new ArrayList<>();
        for (int i = 5; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
