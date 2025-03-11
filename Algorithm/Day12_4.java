/*
    정수가 담긴 배열 numbers 와 문자열 direction 가 매개변수로 주어집니다.
    배열 numbers 의 원소를 direction 방향으로 한 칸씩 회전시킨 배열을 return 하도록
    solution 함수를 완성해주세요.
*/

public class Day12_4 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (direction.equals("right")) {
                answer[(i + 1) % numbers.length] = numbers[i];
            } else if (direction.equals("left")) {
                answer[i] = numbers[(i + 1) % numbers.length];
            }
        }

        return answer;
    }
}
