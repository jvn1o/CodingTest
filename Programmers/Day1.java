public class Day1 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;
        int numer = numer1 + numer2;
        int denom = denom1 * denom2;

        int max = 1;

        for (int i = 1; i <= numer && i <= denom; i++) {
            if (numer % i == 0 && denom % i == 0)
                max = i;
        }

        numer = numer / max;
        denom = denom / max;

        int[] answer = {numer, denom};
        return answer;
    }
}
