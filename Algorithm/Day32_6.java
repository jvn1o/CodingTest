/*
    정수 배열 arr 가 주어집니다.
    arr 의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
    50보다 작은 홀수라면 2를 곱합니다.
    그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
*/

class Day32_6 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 50 && arr[j] % 2 == 0) {
                answer[j] = arr[j] / 2;
            } else if (arr[j] < 50 && arr[j] % 2 != 0) {
                answer[j] = arr[j] * 2;
            } else {
                answer[j] = arr[j];
            }
        }

        return answer;
    }
}
