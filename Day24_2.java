/*
    정수 start_num 와 end_num 가 주어질 때,
    start_num 부터 end_num 까지의 숫자를 차례로 담은 리스트를 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.ArrayList;

class Day24_2 {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> num_list = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            num_list.add(i);
        }

        return num_list.stream().mapToInt(i -> i).toArray();
    }
}
