function PhoneNumberList(phone_book) {
    // 정렬
    phone_book.sort();

    // 인접한 배열끼리 비교
    for (let i = 0; i < phone_book.length - 1; i ++) {
        const current = phone_book[i];
        const next = phone_book[i+1];

        // 접두어에 해당하는 것이 있다면 false
        if (next.startsWith(current)) return false;
    }

    return true;
}