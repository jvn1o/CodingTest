/*
    정수가 들어 있는 배열 num_list 가 매개변수로 주어집니다.
    num_list 의 원소의 순서를 거꾸로 뒤집은 배열을 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.Arrays;

public class Day6_1 {
    public int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length / 2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length - i - 1];
            num_list[num_list.length - i - 1] = temp;
        }
        return num_list;
    }
}
