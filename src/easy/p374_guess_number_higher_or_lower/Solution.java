package easy.p374_guess_number_higher_or_lower;

public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= n) {
            int mid = start + (end - start) / 2;
            int g = guess(mid);
            if (g == 1) {
                start = mid + 1;
            } else if (g == -1) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}
