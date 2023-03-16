import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42584

public class Stock {
    public Stock() {
        System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 2, 3 })));
    }

    public int[] solution(int[] prices) {

        List<Integer> result = new ArrayList<Integer>();

        roop1: for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    result.add(j - i);
                    continue roop1;
                }
            }
            result.add(prices.length - 1 - i);
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        new Stock();
    }
}
