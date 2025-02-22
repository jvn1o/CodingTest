/*
    문자열 myString 과 pat 가 주어집니다.
    myString 의 부분 문자열중 pat 로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는
    solution 함수를 완성해 주세요.
*/

class Day35_1 {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch == pat.charAt(pat.length())) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
