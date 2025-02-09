/*
    정수가 담긴 리스트 num_list 가 주어집니다.
    num_list 의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return 하도록
    solution 함수를 완성해주세요.
*/

class Day22_1 {
    public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int j : num_list) {
            if (j % 2 == 0) {
                even.append(j);
            }
            else {
                odd.append(j);
            }
        }

        int evenNum = Integer.parseInt(even.toString());
        int oddNum = Integer.parseInt(odd.toString());

        return evenNum + oddNum;
    }
}
