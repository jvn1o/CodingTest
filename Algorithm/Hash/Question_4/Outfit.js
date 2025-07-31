function solution(clothes) {
    const clothMap = {};

    // 종류별 개수 집계
    clothes.forEach(([name, type]) => {
        clothMap[type] = (clothMap[type] || 0) + 1;
    });

    // 각 종류마다 (입는 수 + 안 입는 수) 곱
    let answer = Object.values(clothMap)
        .reduce((acc, count) => acc * (count + 1), 1);

    // 아무것도 입지 않는 경우 제외
    return answer -= 1;
}