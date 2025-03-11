/*
    음이 아닌 정수를 9로 나눈 나머지는
    그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
    이 사실을 이용하여 음이 아닌 정수가 문자열 number 로 주어질 때,
    이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
*/

class Day27_1 {
    public int solution(String number) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            sb.append(number.charAt(i));
        }

        for (int j = 0; j < sb.length(); j++) {
            answer += (sb.charAt(j) - '0');
        }

        return answer % 9;
    }
}
