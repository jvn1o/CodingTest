/*
    정수 n이 매개변수로 주어질 때,
    n 이하의 홀수가 오름차순으로 담긴 배열을 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.Arrays;

public class Day6_2 {
    public int[] solution(int n) {
        int[] array = new int[(n + 1) /2];
        for (int i = 0; i <= n ; i++) {
            if (i % 2 == 1) {
                array[i/2] = i;
            }
        }
        return array;
    }
}
