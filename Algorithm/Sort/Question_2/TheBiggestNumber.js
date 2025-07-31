function TheBiggestNumber(numbers) {
    const strNumbers = numbers.map(num => String(num));

    strNumbers.sort((a, b) => (b + a).localeCompare(a + b));

    if (strNumbers[0] === "0") return "0";

    return strNumbers.join('');
}