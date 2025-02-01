/*
    문자열 my_string 이 매개변수로 주어질 때,
    my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록
    solution 함수를 작성해보세요.
*/

import java.util.*;

public class Day14_2 {
    public int[] solution(String my_string) {
        ArrayList<Integer> numberList = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numberList.add(Character.getNumericValue(c));
            }
        }

        Collections.sort(numberList);

        int[] answer = new int[numberList.size()];

        for (int i = 0; i < numberList.size(); i++) {
            answer[i] = numberList.get(i);
        }

        return answer;
    }
}
