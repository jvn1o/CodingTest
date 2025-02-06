/*
    정수 number 와 n, m이 주어집니다.
    number 가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return 하도록
    solution 함수를 완성해주세요.
*/

public class Day19_3 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if ( number % n == 0 && number % m == 0) answer = 1;
        return answer;
    }
}
