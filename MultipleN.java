import java.util.Arrays;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12953

public class MultipleN {
    public MultipleN() {
        System.out.println(solution(new int[] { 2, 6, 8, 14 }));
        System.out.println(solution(new int[] { 1, 2, 3 }));
    }

    public int solution(int[] arr) {

        Arrays.sort(arr);
        int answer = arr[arr.length - 1];

        int cnt = 1;
        while (true) {

            boolean check = true;

            for (int i : arr) {
                if (answer * cnt % i != 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                break;
            }

            cnt++;
        }

        return answer * cnt;
    }

    public static void main(String[] args) {
        new MultipleN();
    }
}
