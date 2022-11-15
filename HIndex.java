package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42747

public class HIndex {
	
	public HIndex() {
		System.out.println(solution(new int[] {3, 0, 6, 1, 5}));
	}
	
    public int solution(int[] citations) {
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for (int i : citations) {
			list.add(i);
		}
    	
    	for (int i = Collections.max(list); i >= 0; i--) {
    		int cnt = 0;
    		for (int j : list) {
				if(j >= i) {
					cnt++;
				}
			}
    		
    		if(cnt >= i && list.size() - cnt <= i) {
    			return i;
    		}
		}
    	
    	return 0;

    }

	public static void main(String[] args) {
		new HIndex();
	}
}
