/*
    두 정수 a, d와 길이가 n인 boolean 배열 included 가 주어집니다.
    첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
    이 등차수열의 1항부터 n 항까지 included 가 true 인 항들만 더한 값을 return 하는
    solution 함수를 작성해 주세요.
*/

class Day21_1 {
    public int solution(int a, int d, boolean[] included) {
        int index = 0;
        int answer = 0;

        for (boolean isIncluded : included) {
            if (isIncluded) {
                answer += a + (index * d);
            }
            index++;
        }

        return answer;
    }
}
