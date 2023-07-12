//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12911

public class NextBig {
    public NextBig() {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }

    public int solution(int n) {
        String before = Integer.toBinaryString(n).replace("0", "");

        while (true) {
            String after = Integer.toBinaryString(++n);

            if (before.equals(after.replace("0", ""))) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        new NextBig();
    }
}
