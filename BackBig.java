//문제: https://school.programmers.co.kr/learn/courses/30/lessons/154539

import java.util.Arrays;
import java.util.Stack;

public class BackBig {
    public BackBig() {
        System.out.println(Arrays.toString(solution(new int[] { 2, 3, 3, 5 })));
        System.out.println(Arrays.toString(solution(new int[] { 9, 1, 5, 3, 6, 2 })));
    }

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<int[]> stack = new Stack<int[]>();
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                if (stack.isEmpty()) {
                    stack.add(new int[] { i, numbers[i] });
                    break;
                }
                if (stack.peek()[1] < numbers[i]) {
                    answer[stack.pop()[0]] = numbers[i];
                    continue;
                }

                stack.add(new int[] { i, numbers[i] });
                break;
            }
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()[0]] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        new BackBig();
    }
}
