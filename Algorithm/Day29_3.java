/*
    알파벳 대소문자로만 이루어진 문자열 my_string 이 주어질 때,
    my_string 에서 'A'의 개수,
    my_string 에서 'B'의 개수,
    ...,
    my_string 에서 'Z'의 개수,
    my_string 에서 'a'의 개수,
    my_string 에서 'b'의 개수
    ,...,
    my_string 에서 'z'의 개수를
    순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
*/

class Day29_3 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++;
            }
        }

        return answer;
    }
}