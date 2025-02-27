/*
    정수로 이루어진 리스트 num_list 가 주어집니다.
    num_list 에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.Arrays;

class Day40_2 {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().toArray();
    }
}
