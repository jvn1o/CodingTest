/*
    정수 배열 arr 가 주어집니다.
    배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는
    solution 함수를 완성해 주세요.

    단, arr 에 2가 없는 경우 [-1]을 return 합니다.
*/


import java.util.Arrays;

class Day30_5 {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        if (start == -1) {
            return new int[] {-1};
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}