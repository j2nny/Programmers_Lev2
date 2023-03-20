import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/131701

public class CircleSequence {
    public CircleSequence() {
        System.out.println(solution(new int[] { 7, 9, 1, 1, 4 }));
    }

    public int solution(int[] elements) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i : elements) {
            list.add(i);
        }

        list.addAll(list);

        Set<Integer> answer = new HashSet<Integer>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += list.get(k);
                }
                answer.add(sum);
            }
        }

        return answer.size();
    }

    public static void main(String[] args) {
        new CircleSequence();
    }
}
