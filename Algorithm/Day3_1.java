/*
    두 배열이 얼마나 유사한지 확인해보려고 합니다.
    문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
*/

import java.util.Arrays;

public class Day3_1 {
    public int solution(String[] s1, String[] s2) {
        int sum = 0;
        for (String i : s1) {
            for (String j : s2) {
                if (i.equals(j)) sum++;
            }
        }
        return sum;
    }
}
