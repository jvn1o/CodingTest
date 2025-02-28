/*
    한 자리 정수로 이루어진 문자열 num_str 이 주어질 때,
    각 자리수의 합을 return 하도록 solution 함수를 완성해주세요.
*/

class Day41_3 {
    public int solution(String num_str) {
        return num_str.chars().map(c -> c - '0').sum();
        // '0' 혹은 48 을 빼도 된다.
    }
}