package level2;

import java.util.ArrayList;
import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42586

public class Develop {
    public Develop() {
        System.out.println(Arrays.toString(solution(new int[] { 93, 30, 55 }, new int[] { 1, 30, 5 })));
        System.out.println(
                Arrays.toString(solution(new int[] { 95, 90, 99, 99, 80, 99 }, new int[] { 1, 1, 1, 1, 1, 1 })));
    }

    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Function> list = new ArrayList<Function>();
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < progresses.length; i++) {
            Function func = new Function();
            func.progress = progresses[i];
            func.speed = speeds[i];

            list.add(func);
        }

        while (!list.isEmpty()) {
            int idx = 0;
            for (Function func : list) {
                func.progress += func.speed;
                list.set(idx++, func);
            }

            int done = 0;
            while (!list.isEmpty() && list.get(0).progress >= 100) {
                list.remove(0);
                done++;
            }

            if (done != 0) {
                answer.add(done);
            }
        }

        int[] ans = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        new Develop();
    }
}

class Function {
    int progress;
    int speed;
}
