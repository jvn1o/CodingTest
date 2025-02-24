/*
    문자열 binomial 이 매개변수로 주어집니다.
    binomial 은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수,
    op는 '+', '-', '*' 중 하나입니다.
    주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
*/

class Day37_2 {
    public int solution(String binomial) {
        String[] bio = binomial.split(" ");
        int a = Integer.parseInt(bio[0]);
        String op = bio[1];
        int b = Integer.parseInt(bio[2]);

        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };
    }
}
