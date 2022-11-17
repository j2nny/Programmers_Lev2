package level2;

public class RightBracket {

	public RightBracket() {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}

	boolean solution(String s) {

		int cnt = 0;

		for (char str : s.toCharArray()) {

			if(str == '(') {
				cnt++;
			} else {
				if(cnt == 0) {
					return false;
				}
				cnt--;
			}
		}

		return cnt == 0;
	}

	public static void main(String[] args) {
		new RightBracket();
	}
}
