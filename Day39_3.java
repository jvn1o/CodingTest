/*
    문자열 배열 strArr 이 주어집니다.
    strArr 의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
    가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
*/

import java.util.HashMap;
import java.util.Map;

class Day39_3 {
    public int solution(String[] strArr) {
        Map<Integer, Integer> count = new HashMap<>();

        for (String str : strArr) {
        count.put(str.length(), count.getOrDefault(str.length(), 0) + 1);
        }

        return count.values().stream().max(Integer::compare).orElse(0);
    }
}
