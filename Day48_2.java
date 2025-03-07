/*
    수포자는 수학을 포기한 사람의 준말입니다.
    수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
    수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
    ...

    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1,
    2, 3, 2, 4, 2, 5, ...

    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
    3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

    1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers 가 주어졌을 때,
    가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록
    solution 함수를 작성해주세요.
*/

import java.util.ArrayList;
import java.util.List;

class Day48_2 {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};           // 1번 수포자 5개 패턴 반복
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};  // 2번 수포자 8개 패턴 반복
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 3번 수포자 10개 패턴 반복

        int[] scores = new int[3]; // {1번, 2번, 3번}의 맞힌 개수

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) scores[0]++;
            if (answers[i] == p2[i % p2.length]) scores[1]++;
            if (answers[i] == p3[i % p3.length]) scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
