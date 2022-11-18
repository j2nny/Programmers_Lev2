package level2;

import java.util.ArrayList;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12973

public class removeCouple {

	public removeCouple() {
		System.out.println(solution("baabaa"));
		System.out.println(solution("cbcb"));
	}

	public int solution(String s){
		
    	List<Character> list = new ArrayList<Character>();
    	
    	for (Character ch : s.toCharArray()) {
			if(!list.isEmpty() && list.get(list.size()-1) == ch){
				list.remove(list.size()-1);
			} else {
				list.add(ch);
			}
		}

        return list.isEmpty() ? 1 : 0;

	}

	public static void main(String[] args) {
		new removeCouple();
	}
}
