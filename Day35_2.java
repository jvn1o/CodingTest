/*
    문자열 myString 과 pat 이 주어집니다.
    myString 에서 pat 이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
*/

class Day35_2 {
    public int solution(String myString, String pat) {
        int count = 0;
        int index = 0;

        while ((index = myString.indexOf(pat, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }
}
