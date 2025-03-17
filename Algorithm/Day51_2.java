/*
    정수 배열 numbers 가 매개변수로 주어집니다.
    numbers 의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return 하도록
    solution 함수를 완성해주세요.
*/

class Day51_2 {
    public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2, min1 * min2);
    }
}
