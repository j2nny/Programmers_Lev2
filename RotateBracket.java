//문제: https://school.programmers.co.kr/learn/courses/30/lessons/76502

import java.util.Stack;

public class RotateBracket {
    public RotateBracket() {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
        System.out.println(solution("}}}"));
    }

    public int solution(String s) {

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {

            Stack<Character> stack = new Stack<Character>();
            for (char ch : s.toCharArray()) {
                if (stack.isEmpty() && (ch == ']' || ch == '}' || ch == ')')) {
                    stack.push(ch);
                    break;
                }

                if ((ch == ']' && stack.peek() == '[')
                        || (ch == '}' && stack.peek() == '{'
                                || (ch == ')' && stack.peek() == '('))) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }

            s = s.substring(1) + s.substring(0, 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        new RotateBracket();
    }
}
