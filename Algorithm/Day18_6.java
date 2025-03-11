/*
    문자열 my_string 과 정수 k가 주어질 때,
    my_string 을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
*/

public class Day18_6 {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        int i = 0;

        while (i < k) {
            answer.append(my_string);
            i++;
        }

        return answer.toString();
    }
}
