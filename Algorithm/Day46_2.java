/*
    정수 배열 arr 와 자연수 k가 주어집니다.

    만약 k가 홀수라면 arr 의 모든 원소에 k를 곱하고,
    k가 짝수라면 arr 의 모든 원소에 k를 더합니다.

    이러한 변환을 마친 후의 arr 를 return 하는 solution 함수를 완성해 주세요.
*/

import java.util.Arrays;

class Day46_2 {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                .map(i -> k % 2 == 1 ? i * k : i + k)
                .toArray();
    }
}
