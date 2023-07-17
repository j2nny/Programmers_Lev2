//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12985

public class Fight {
    public Fight() {
        System.out.println(solution(8, 4, 7));
    }

    public int solution(int n, int a, int b) {

        int answer = 1;

        while (true) {

            if (Math.min(a, b) % 2 == 1 && Math.max(a, b) - Math.min(a, b) == 1) {
                break;
            }

            a = (a + 1) / 2;
            b = (b + 1) / 2;

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        new Fight();
    }
}
