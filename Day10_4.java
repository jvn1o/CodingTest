/*
    가위는 2 바위는 0 보는 5로 표현합니다.
    가위 바위 보를 내는 순서대로 나타낸 문자열 rsp 가 매개변수로 주어질 때,
    rsp 에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return 하도록
    solution 함수를 완성해보세요.
*/

import java.util.Objects;

public class Day10_4 {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            if (c == '2') {
                answer.append('0');
            } else if (c == '0') {
                answer.append('5');
            } else if (c == '5') {
                answer.append('2');
            }
        }

        return answer.toString();
    }
}
