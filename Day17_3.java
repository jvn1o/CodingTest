/*
    문자열 str 과 정수 n이 주어집니다.
    str 이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
*/

import java.util.Scanner;

public class Day17_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.print(str.repeat(n));
    }
}
