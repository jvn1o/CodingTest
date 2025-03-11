/*
    문자열 my_string 과 정수 배열 indices 가 주어질 때,
    my_string 에서 indices 의 원소에 해당하는 인덱스의 글자를 지우고
    이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
*/

import java.util.*;

class Day29_5 {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);

        StringBuilder answer = new StringBuilder(my_string);

        for (int i = indices.length - 1; i >= 0; i--) {
            answer.deleteCharAt(indices[i]);
        }

        return answer.toString();
    }
}