import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class BinaryConversion {
    public BinaryConversion() {
        System.out.println(Arrays.toString(solution("110010101001")));
        System.out.println(Arrays.toString(solution("01110")));
        System.out.println(Arrays.toString(solution("1111111")));
    }

    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!"1".equals(s)) {
            String before = s;
            s = s.replace("0", "");
            answer[1] += before.length() - s.length();
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        new BinaryConversion();
    }
}
