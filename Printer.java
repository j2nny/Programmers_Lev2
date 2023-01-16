package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42587

public class Printer {
    public Printer() {
        System.out.println(solution(new int[] { 2, 1, 3, 2 }, 2));
        System.out.println(solution(new int[] { 1, 1, 9, 1, 1, 1 }, 0));
    }

    public int solution(int[] priorities, int location) {

        List<Integer> priorityList = new ArrayList<Integer>();
        for (int priority : priorities) {
            priorityList.add(priority);
        }

        Queue<Doc> printQueue = new LinkedList();

        int idx = 0;
        for (int i : priorities) {
            Doc doc = new Doc();
            doc.idx = idx++;
            doc.priority = i;
            printQueue.add(doc);
        }

        System.out.println(printQueue);

        int answer = 1;

        while (true) {
            Doc front = printQueue.poll();
            if (front.priority < Collections.max(priorityList)) {
                printQueue.offer(front);
            } else {
                if (front.idx == location) {
                    return answer;
                } else {
                    answer++;
                    priorityList.remove(Integer.valueOf(front.priority));
                }
            }
        }
    }

    public static void main(String[] args) {
        new Printer();
    }
}

class Doc {
    int idx;
    int priority;

    @Override
    public String toString() {
        return idx + "-" + priority;
    }
}
