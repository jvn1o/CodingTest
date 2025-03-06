/*
    이차원 정수 배열 arr 이 매개변수로 주어집니다.
    arr 의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
    열의 수가 더 많다면 행의 수가 열의 수와 같아지도록
    각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
*/

class Day47_4 {
    public int[][] solution(int[][] arr) {
        int[][] answer = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }

        return answer;
    }
}