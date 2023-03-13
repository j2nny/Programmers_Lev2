import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/17684

public class Compression {
    public Compression() {
        System.out.println(Arrays.toString(solution("KAKAO")));
        System.out.println(Arrays.toString(solution("TOBEORNOTTOBEORTOBEORNOT")));
        System.out.println(Arrays.toString(solution("ABABABABABABABAB")));
        System.out.println(Arrays.toString(solution("A")));
    }

    public int[] solution(String msg) {

        List<String> dictionary = new ArrayList<String>();

        for (int i = 'A'; i <= 'Z'; i++) {
            dictionary.add(String.valueOf((char) i));
        }

        List<Integer> result = new ArrayList<Integer>();

        int idx = 0;
        while (idx < msg.length()) {
            if (idx == 0) {
                result.add(dictionary.indexOf(msg.substring(0, 1)) + 1);
                if (msg.length() != 1) {
                    dictionary.add(msg.substring(0, 2));
                }
                idx++;
            } else {
                for (int i = msg.length(); i > idx; i--) {
                    if (dictionary.contains(msg.substring(idx, i))) {
                        result.add(dictionary.indexOf(msg.substring(idx, i)) + 1);
                        if (i != msg.length()) {
                            dictionary.add(msg.substring(idx, i + 1));
                        }
                        idx = i;
                        break;
                    }
                }
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        new Compression();
    }
}
