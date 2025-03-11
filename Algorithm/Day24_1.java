/*
    정수 l과 r이 주어졌을 때,
    l 이상 r 이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를
    오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

    만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
*/

import java.util.ArrayList;

class Day24_1 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            boolean valid = true;

            for (char c : str.toCharArray()) {
                if (c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            return new int[]{-1};
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
