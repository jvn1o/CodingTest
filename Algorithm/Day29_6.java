/*
    정수 start_num 와 end_num 가 주어질 때,
    start_num 에서 end_num 까지 1씩 감소하는 수들을 차례로 담은 리스트를 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.ArrayList;

class Day29_6 {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = start_num; i >= end_num; i--) {
            answer.add(i);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}