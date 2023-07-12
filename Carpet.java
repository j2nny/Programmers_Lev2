import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42842

public class Carpet {
    public Carpet() {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
        System.out.println(Arrays.toString(solution(18, 6)));
    }

    public int[] solution(int brown, int yellow) {

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0 && 2 * (i + yellow / i) + 4 == brown) {
                return new int[] { (brown + yellow) / (i + 2), i + 2 };
            }
        }

        return null;
    }

    public static void main(String[] args) {
        new Carpet();
    }
}
