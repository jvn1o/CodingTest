/*
    문자열 배열 intStrs 와 정수 k, s, l가 주어집니다.
    intStrs 의 원소는 숫자로 이루어져 있습니다.

    배열 intStrs 의 각 원소마다 s번 인덱스에서 시작하는
    길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
    이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
*/

import java.util.*;

class Day27_3 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String number : intStrs) {
            String subNum = number.substring(s, s + l);

            int num = Integer.parseInt(subNum);

            if (num > k) answer.add(num);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
