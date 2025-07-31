function BestAlbum(genres, plays) {
    // 장르별 총 재생 횟수 저장용 Map
    const genrePlayCount = new Map();

    // 장르별 노래 리스트 저장용 Map
    const genreSongMap = new Map();

    // 모든 노래 순회하며 Map 채우기
    for (let i = 0; i < genres.length; i++) {
        const genre = genres[i];
        const play = plays[i];

        // 1. 장르별 총 재생 횟수 누적
        genrePlayCount.set(genre, (genrePlayCount.get(genre) || 0) + play);

        // 2. 장르별 노래 리스트 초기화 및 추가
        if (!genreSongMap.has(genre)) {
            genreSongMap.set(genre, []);
        }
        genreSongMap.get(genre).push({ id: i, plays: play });
    }

    // 장르를 총 재생 횟수 기준으로 내림차순 정렬
    const sortedGenres = [...genrePlayCount.entries()]
        .sort((a, b) => b[1] - a[1]) // 재생횟수 기준 내림차순
        .map(entry => entry[0]);     // 장르명만 추출

    const result = [];

    // 정렬된 장르 순서대로 처리
    for (const genre of sortedGenres) {
        const songs = genreSongMap.get(genre);

        // 해당 장르의 노래를 재생 횟수 내림차순 → 고유번호 오름차순 정렬
        songs.sort((a, b) => {
            if (b.plays !== a.plays) return b.plays - a.plays;
            return a.id - b.id;
        });

        // 상위 2곡까지 결과에 추가
        for (let i = 0; i < Math.min(2, songs.length); i++) {
            result.push(songs[i].id);
        }
    }

    return result;
}
