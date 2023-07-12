import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/64065

public class Tuple {

    public Tuple() {
        System.out.println(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
        System.out.println(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
        System.out.println(solution("{{20,111},{111}}"));
        System.out.println(solution("{{123}}"));
        System.out.println(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
    }

    public List<Integer> solution(String s) {

        PriorityQueue<String> queue = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.split(",").length > o2.split(",").length) {
                    return 1;
                }

                return -1;
            }
        });

        for (String element : s.substring(2, s.length() - 2).split("\\},\\{")) {
            queue.add(element);
        }

        List<Integer> answer = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            for (String string : queue.poll().split(",")) {
                if (!answer.contains(Integer.parseInt(string))) {
                    answer.add(Integer.parseInt(string));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        new Tuple();
    }
}
