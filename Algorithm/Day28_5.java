/*
    문자열 my_string 과 정수 s, e가 매개변수로 주어질 때,
    my_string 에서 인덱스 s부터 인덱스 e 까지를 뒤집은 문자열을 return 하는
    solution 함수를 작성해 주세요.
*/

class Day28_5 {
    public String solution(String my_string, int s, int e) {
        return my_string.substring(0, s)
                + new StringBuilder(my_string.substring(s, e + 1))
                .reverse()
                .toString()
                + my_string.substring(e + 1);
    }
}