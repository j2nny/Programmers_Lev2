package level2;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12924

public class NaturalNumSum {
	
	public NaturalNumSum() {
		System.out.println(solution(15));
	}
	
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i < n; i++) {
			int sum = 0;
			int num = i;
			while(sum <= n){
				if(sum == n) {
					answer++;
					break;
				}
				sum += num;
				num++;
			}
		}
        
        return answer + 1;
    }

	public static void main(String[] args) {
		new NaturalNumSum();
	}
}
