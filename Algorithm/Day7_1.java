/*
    정수 배열 numbers 가 매개변수로 주어집니다.
    numbers 의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
    return 하도록 solution 함수를 완성해주세요.
*/

import java.util.Arrays;

public class Day7_1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        return numbers[n-1] * numbers[n-2];
    }
}
