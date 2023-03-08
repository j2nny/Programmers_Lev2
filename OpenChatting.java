import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42888

public class OpenChatting {
    public OpenChatting() {
        System.out.println(Arrays.toString(solution(new String[] { "Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan" })));
    }

    public String[] solution(String[] record) {

        Map<String, String> member = new HashMap<String, String>();

        for (String string : record) {
            switch (string.split(" ")[0]) {
                case "Enter", "Change":
                    member.put(string.split(" ")[1], string.split(" ")[2]);
                    break;
            }
        }

        List<String> result = new ArrayList<>();

        for (String string : record) {

            switch (string.split(" ")[0]) {
                case "Enter":
                    result.add(member.get(string.split(" ")[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    result.add(member.get(string.split(" ")[1]) + "님이 나갔습니다.");
                    break;
            }
        }

        String[] answer = new String[result.size()];

        int idx = 0;
        for (String string : result) {
            answer[idx++] = string;
        }
        return answer;
    }

    public static void main(String[] args) {
        new OpenChatting();
    }
}
