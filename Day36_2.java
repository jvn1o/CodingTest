/*
    단어가 공백 한 개로 구분되어 있는 문자열 my_string 이 매개변수로 주어질 때,
    my_string 에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는
    solution 함수를 작성해 주세요.
*/

import java.util.ArrayList;
import java.util.List;

class Day36_2 {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.startsWith(" ")) answer.add(my_string.substring(1));
        }

        return answer.toArray(new String[0]);
    }
}
