/*
    알파벳으로 이루어진 문자열 myString 과 pat 이 주어집니다.
    myString 의 연속된 부분 문자열 중 pat 이 존재하면 1을 그렇지 않으면 0을 return 하는
    solution 함수를 완성해 주세요.

    단, 알파벳 대문자와 소문자는 구분하지 않습니다.
*/

class Day33_4 {
    public int solution(String myString, String pat) {
        String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();

        return (lowerMyString.contains(lowerPat)) ? 1 : 0;
    }
}
