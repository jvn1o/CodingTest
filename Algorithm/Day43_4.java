/*
    정수 리스트 num_list 와 찾으려는 정수 n이 주어질 때,
    num_list 안에 n이 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.Arrays;

class Day43_4 {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list)
                .anyMatch(num -> num == n) ? 1 : 0;
    }
}
