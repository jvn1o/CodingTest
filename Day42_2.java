/*
    정수로 이루어진 문자열 n_str 이 주어질 때,
    n_str 의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return 하도록
    solution 함수를 완성해주세요.
*/

class Day42_2 {
    public String solution(String n_str) {
        int index = 0;
        while (index < n_str.length() && n_str.charAt(index) == '0') {
            index++;
        }

        return n_str.substring(index);
    }
}