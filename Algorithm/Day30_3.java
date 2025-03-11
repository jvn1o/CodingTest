/*
    정수 리스트 num_list 가 주어질 때,
    첫 번째로 나오는 음수의 인덱스를 return 하도록 solution 함수를 완성해주세요.
    음수가 없다면 -1을 return 합니다.
*/


class Day30_3 {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        return -1;
    }
}