package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12981

public class EnglishWordsGame {

	public EnglishWordsGame() {
		System.out.println(Arrays.toString(solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
		System.out.println(Arrays.toString(solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
		System.out.println(Arrays.toString(solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"})));
	}
	
    public int[] solution(int n, String[] words) {
    	
    	List<String> list = new ArrayList<String>();
    	
    	for (String string : words) {
			list.add(string);
		}
    	
    	String end = "";
    	
        for (int i = 0; i < list.size(); i++) {
			if(!list.get(i).startsWith(end) || list.indexOf(list.get(i)) != i) {
				return new int[] {(i % n) + 1, i / n + 1};
			}
			end = list.get(i).split("")[list.get(i).length()-1];
		}
        
        return new int[]{0, 0};
    }
	
	public static void main(String[] args) {
		new EnglishWordsGame();
	}

}
