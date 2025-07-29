function Ponkemon(nums) {
    const ponkemonList = new Set();

    for (const num of nums) {
        ponkemonList.add(num);
    }

    const select = nums.length / 2;

    return Math.min(ponkemonList.size, select);
}