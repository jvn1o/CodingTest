/*
    문자열 myString 과 pat 이 주어집니다.
    myString 에서 pat 이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
*/

class Day35_2 {
    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
