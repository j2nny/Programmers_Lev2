//문제: https://school.programmers.co.kr/learn/courses/30/lessons/17680

import java.util.LinkedList;
import java.util.Queue;

public class Cache {
    public Cache() {
        System.out.println(solution(3, new String[] { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo",
                "Seoul", "NewYork", "LA" }));
        System.out.println(solution(3,
                new String[] { "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul" }));
        System.out.println(solution(2, new String[] { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco",
                "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome" }));
        System.out.println(solution(5, new String[] { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco",
                "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome" }));
        System.out.println(solution(2, new String[] { "Jeju", "Pangyo", "NewYork", "newyork" }));
        System.out.println(solution(0, new String[] { "Jeju", "Pangyo", "Seoul", "NewYork", "LA" }));
    }

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Queue<String> queue = new LinkedList<String>();

        for (String city : cities) {

            String cityName = city.toLowerCase();
            answer += queue.contains(cityName) ? 1 : 5;

            queue.remove(cityName);
            queue.add(cityName);

            if (queue.size() > cacheSize) {
                queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        new Cache();
    }
}
