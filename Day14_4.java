/*
    소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
    예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
    따라서 12의 소인수는 2와 3입니다.
    자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return 하도록
    solution 함수를 완성해주세요.
*/

import java.util.*;

public class Day14_4 {
    public int[] solution(int n) {
        Set<Integer> numberList = new TreeSet<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                // if 문을 사용하면 중복된 소인수는 1번만 체크하고 넘어가버리기때문에 while 사용
                numberList.add(i);
                n /= i;
            }
        }

        int[] answer = new int[numberList.size()];
        int index = 0;
        for (int number : numberList) {
            answer[index++] = number;
        }

        return answer;
    }
}
