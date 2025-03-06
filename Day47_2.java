/*
    양의 정수 n이 매개변수로 주어집니다.
    n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터
    시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
*/

class Day47_2 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int left = 0, top = 0;
        int right = n - 1, bottom = n - 1;

        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                answer[bottom][i] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                answer[i][left] = num++;
            }
            left++;
        }

        return answer;
    }
}
