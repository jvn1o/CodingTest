/*
    정수 배열 arr 과 delete_list 가 있습니다.
    arr 의 원소 중 delete_list 의 원소를 모두 삭제하고
    남은 원소들은 기존의 arr 에 있던 순서를 유지한 배열을 return 하는
    solution 함수를 작성해 주세요.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Day42_5 {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteNum = new HashSet<>();
        for (int num : delete_list) {
            deleteNum.add(num);
        }

        return Arrays.stream(arr)
                .filter(num -> !deleteNum.contains(num))
                .toArray();
    }
}