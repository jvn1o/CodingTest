/*
    정수 배열 arr 와 2차원 정수 배열 queries 이 주어집니다.
    queries 의 원소는 각각 하나의 query 를 나타내며, [s, e] 꼴입니다.

    각 query 마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.

    위 규칙에 따라 queries 를 처리한 이후의 arr 를 return 하는 solution 함수를 완성해 주세요.
*/

import java.util.*;

class Day32_5 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            for (int i = s; i <= e; i++) {
                if (i < arr.length) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}
