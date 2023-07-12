import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/87390

public class CutArray {
    public CutArray() {
        System.out.println(Arrays.toString(solution(3, 2, 5)));
        System.out.println(Arrays.toString(solution(4, 7, 14)));
    }

    public long[] solution(int n, long left, long right) {

        long[] answer = new long[(int) (right - left + 1)];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            answer[idx++] = Math.max(i / n, i % n) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        new CutArray();
    }
}
