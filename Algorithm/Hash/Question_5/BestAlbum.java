import java.util.*;

/*
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

제한사항
genres[i]는 고유번호가 i인 노래의 장르입니다.
plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
장르 종류는 100개 미만입니다.
장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
모든 장르는 재생된 횟수가 다릅니다.
 */

public class BestAlbum {

    // 각 노래마다 장르와 재생 횟수를 담을 수 있는 클래스 생성
    class Song {
        int id;
        String genre;
        int plays;

        public Song(int id, String genre, int plays) {
            this.id = id;
            this.genre = genre;
            this.plays = plays;
        }
    }

    public int[] solution(String[] genres, int[] plays) {

        // 장르별 총 재생 횟수를 저장할 Map
        Map<String, Integer> countMap = new HashMap<>();

        // 장르별로 노래 리스트를 저장할 Map
        Map<String, List<Song>> genreMap = new HashMap<>();

        // 모든 노래 정보를 순회하며 countMap, genreMap 채우기
        for (int i = 0; i < genres.length; i++) {
            // 장르별 총 재생 횟수 누적
            countMap.put(genres[i], countMap.getOrDefault(genres[i], 0) + plays[i]);

            // 해당 장르가 처음 등장했다면 빈 리스트 생성
            genreMap.putIfAbsent(genres[i], new ArrayList<>());

            // 노래 정보를 Song 객체로 만들어 리스트에 추가
            genreMap.get(genres[i]).add(new Song(i, genres[i], plays[i]));
        }

        // 장르 이름 리스트를 가져와서 총 재생 횟수 기준으로 내림차순 정렬
        List<String> sortedGenres = new ArrayList<>(countMap.keySet());

        // 인기 많은 장르부터
        sortedGenres.sort((a, b) -> countMap.get(b) - countMap.get(a));

        // 최종 결과를 담을 리스트
        List<Integer> result = new ArrayList<>();

        // 정렬된 장르 순서대로 처리
        for (String genre : sortedGenres) {

            // 해당 장르의 노래 리스트 가져오기
            List<Song> songs = genreMap.get(genre);

            // 재생 횟수 내림차순, 같으면 고유 번호 오름차순 정렬
            songs.sort((a, b) -> {
                if (b.plays != a.plays) return b.plays - a.plays; // 재생 많은 순
                return a.id - b.id; // 같으면 고유번호 낮은 순
            });

            // 정렬된 노래 리스트에서 최대 2곡까지 결과에 추가
            for (int i = 0; i < songs.size() && i < 2; i++) {
                result.add(songs.get(i).id);
            }
        }

        // List<Integer> → int[] 로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
        }
    }
}