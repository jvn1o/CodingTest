/*
    약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
    자연수 n이 매개변수로 주어질 때 n 이하의 합성수의 개수를 return 하도록
    solution 함수를 완성해주세요.
*/

public class Day13_4 {
    public int solution(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int divisor = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    divisor++;
                    if (j != i / j) divisor++;
                }
            }
            if (divisor >= 3) count++;
        }

        return count;
    }
}
