/*
    정수 배열 array 와 정수 n이 매개변수로 주어질 때,
    array 에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록
    solution 함수를 완성해주세요.
*/

public class Day16_2 {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i] - n) <
                    Math.abs(array[i + 1] - n))
                answer = array[i];
            else answer = array[i + 1];
        }

        return answer;
    }
}
