/*
    문자열 my_string 과 정수 n이 매개변수로 주어질 때,
    my_string 에 들어있는 각 문자를 n만큼
    반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
*/

import java.util.Arrays;

public class Day8_2 {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            result.append(String.valueOf(c).repeat(Math.max(0, n)));
        }

        return result.toString();
    }
}
