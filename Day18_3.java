/*
    문자열 my_string, overwrite_string 과 정수 s가 주어집니다.
    문자열 my_string 의 인덱스 s부터 overwrite_string 의 길이만큼을
    문자열 overwrite_string 으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
*/

import java.util.Scanner;

public class Day18_3 {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < overwrite_string.length(); i++) {
            sb.setCharAt(i + s, overwrite_string.charAt(i));
        }

        return sb.toString();
    }
}
