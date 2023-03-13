//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42626

import java.util.PriorityQueue;

public class MoreSpicy {
    public MoreSpicy() {
        System.out.println(solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7));
        System.out.println(solution(new int[] { 1, 1 }, 7));
    }

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i : scoville) {
            pq.add(i);
        }

        if (pq.peek() >= K) {
            return 0;
        }

        int answer = 0;

        while (pq.peek() < K) {

            if (pq.size() < 2) {
                return -1;
            }

            pq.offer(pq.poll() + (pq.poll() * 2));
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        new MoreSpicy();
    }
}
