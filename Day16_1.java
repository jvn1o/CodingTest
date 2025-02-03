/*
    문자열 my_string 이 매개변수로 주어집니다. '
    my_string 에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.Set;
import java.util.TreeSet;

public class Day16_1 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> seen = new TreeSet<>();

        for (char c : my_string.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
