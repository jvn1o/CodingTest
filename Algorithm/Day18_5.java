/*
    문자들이 담겨있는 배열 arr 가 주어집니다.
    arr 의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
*/

public class Day18_5 {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }
}
