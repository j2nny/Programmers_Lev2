package level2;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class JadenCase {

	public JadenCase() {
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week  "));
	}

	public String solution(String s) {
		
		boolean firstLetter = true;
		
		String answer = "";
		
		for (String str : s.split("")) {
			answer += firstLetter ? str.toUpperCase() : str.toLowerCase();
			firstLetter = " ".equals(str);
			}
		
		return answer;
	}

	public static void main(String[] args) {
		new JadenCase();
	}

}
