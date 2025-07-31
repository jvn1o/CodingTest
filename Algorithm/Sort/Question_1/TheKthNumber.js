function TheKthNumber(array, commands) {
    // 결과를 담을 배열 생성
    const answer = [];

    for (let i = 0; i < commands.length; i++) {
        const [start, end, k] = commands[i];

        const sliced = array.slice(start - 1, end);

        sliced.sort((a,b) => a - b);

        answer.push(sliced[k - 1]);
    }

    return answer;
}