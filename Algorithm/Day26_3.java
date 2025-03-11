/*
    문자열 my_string 과 정수 배열 index_list 가 매개변수로 주어집니다.
    my_string 의 index_list 의 원소들에 해당하는 인덱스의 글자들을
    순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
*/

class Day26_3 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for (int j : index_list) {
            answer.append(my_string.charAt(j));
        }

        return answer.toString();
    }
}
