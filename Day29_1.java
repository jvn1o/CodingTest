/*
    문자열 my_string 과 두 정수 m, c가 주어집니다.
    my_string 을 한 줄에 m 글자씩 가로로 적었을 때
    왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
*/

import java.util.*;

class Day29_1 {
    public String solution(String my_string, int m, int c) {
        List<String> str = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m) {
            str.add(String.valueOf(my_string.charAt(i + c - 1)));
        }

        return String.join("", str);
    }
}