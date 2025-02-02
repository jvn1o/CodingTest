/*
    숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    문자열에 있는 숫자를 차례대로 더하려고 합니다.
    이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
    숫자와 "Z"로 이루어진 문자열 s가 주어질 때,
    머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

    # 다른 사람의 풀이를 보고 Stack 을 이용해도 좋을 것 같다는 생각을 했다.
      직전에 담았던 내용을 뺄수도 있다는 가정에는 Stack 만한 것이 없기 때문이다.
      public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
     }
*/

public class Day15_1 {
    public int solution(String s) {
        String[] parts = s.split(" ");

        int answer = 0;
        int lastNumber = 0;

        for (String part : parts) {
            if (part.equals("Z")) {
                answer -= lastNumber;
            } else {
                lastNumber = Integer.parseInt(part);
                answer += lastNumber;
            }
        }

        return answer;
    }
}
