package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/138476

public class SelectGyul {
    public SelectGyul() {
        System.out.println(solution(6, new int[] { 1, 3, 2, 5, 4, 5, 2, 3 }));
        System.out.println(solution(4, new int[] { 1, 3, 2, 5, 4, 5, 2, 3 }));
        System.out.println(solution(2, new int[] { 1, 1, 1, 1, 2, 2, 2, 3 }));
    }

    public int solution(int k, int[] tangerine) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i : tangerine) {
            list.add(i);
        }

        int[] cnt = new int[Collections.max(list)];

        for (int i : list) {
            cnt[i - 1]++;
        }

        Arrays.sort(cnt);

        int answer = 0;

        for (int i = cnt.length - 1; i >= 0; i--) {
            k -= cnt[i];
            answer++;

            if (k <= 0) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        new SelectGyul();
    }
}
