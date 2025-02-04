/*
    영어 알파벳으로 이루어진 문자열 str 이 주어집니다.
    각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
*/

import java.util.Scanner;

public class Day17_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder answer = new StringBuilder();

        for (char ch : a.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                answer.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                answer.append(Character.toUpperCase(ch));
            }
        }

        System.out.print(answer);
    }
}
