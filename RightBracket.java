package level2;

public class RightBracket {

	public RightBracket() {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}

	boolean solution(String s) {

		while(!"".equals(s)) {
			if(s.startsWith("(") && s.endsWith(")")) {
				s = s.replace("()", "");
			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		new RightBracket();
	}
}
