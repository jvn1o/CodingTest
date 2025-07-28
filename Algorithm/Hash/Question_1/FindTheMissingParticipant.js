function solution(participant, completion) {
    const map = new Map();

    // 참가자 이름 수 세기
    for (const name of participant) {
        map.set(name, (map.get(name) || 0) + 1);
    }

    // 완주한 사람 수 세기
    for (const name of completion) {
        map.set(name, map.get(name) - 1)
    }

    // 정답
    for (const [name, count] of map.entries()) {
        if (count > 0) return name;
    }

    // 예외
    return '';
}