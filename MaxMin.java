package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {
	
	public MaxMin() {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-1 -2 -3 -4"));
		System.out.println(solution("-1 -1"));
	}
	
    public String solution(String s) {
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for (String str : s.split(" ")) {
			list.add(Integer.parseInt(str));
		}
    	
        return Collections.min(list) + " " + Collections.max(list);
    }

	public static void main(String[] args) {
		new MaxMin();
	}
}
