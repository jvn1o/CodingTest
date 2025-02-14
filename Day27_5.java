/*
    문자열 my_string 과 정수 n이 매개변수로 주어질 때,
    my_string 의 뒤의 n 글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
*/

class Day27_5 {
    public String solution(String my_string, int n) {
        int startIndex = my_string.length() - n;

        return my_string.substring(startIndex);
    }
}
