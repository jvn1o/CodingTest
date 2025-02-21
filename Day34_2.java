/*
    문자열 myString 이 주어집니다.
    myString 에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,
    "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는
    solution 함수를 완성하세요.
*/

class Day34_2 {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch == 'a') {
                answer.append('A');
            } else if (ch >= 'A' && ch <= 'Z' && ch != 'A') {
                answer.append(Character.toLowerCase(ch));
            } else {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}
