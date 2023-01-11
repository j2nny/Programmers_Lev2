package level2;

import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12941

public class MakeMin {

    public MakeMin() {
        System.out.println(solution(new int[] { 1, 4, 2 }, new int[] { 5, 4, 4 }));
        System.out.println(solution(new int[] { 1, 2 }, new int[] { 3, 4 }));
    }

    public int solution(int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;

        int idx = B.length;
        for (int i : A) {
            answer += i * B[--idx];
        }

        return answer;
    }

    public static void main(String[] args) {
        new MakeMin();
    }
}
