import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//문제: https://school.programmers.co.kr/learn/courses/30/lessons/17677

public class NewsClustering {
    public NewsClustering() {
        System.out.println(solution("FRANCE", "french"));
        System.out.println(solution("handshake", "shake hands"));
        System.out.println(solution("aa1+aa2", "AAAA12"));
        System.out.println(solution("E=M*C^2", "e=m*c^2"));
        System.out.println(solution("abab", "baba"));
    }

    public int solution(String str1, String str2) {

        List<String> list1 = makeList(str1);
        List<String> list2 = makeList(str2);

        if (list1.size() == 0 && list2.size() == 0) {
            return 65536;
        }

        Map<String, int[]> hm = new HashMap<String, int[]>();

        for (String str : list1) {
            if (hm.containsKey(str)) {
                int[] val = hm.get(str);
                val[0]++;
                hm.put(str, val);
            } else {
                hm.put(str, new int[] { 1, 0 });
            }
        }

        for (String str : list2) {
            if (hm.containsKey(str)) {
                int[] val = hm.get(str);
                val[1]++;
                hm.put(str, val);
            } else {
                hm.put(str, new int[] { 0, 1 });
            }
        }

        int intersection = 0;
        int union = 0;

        for (String key : hm.keySet()) {
            int[] val = hm.get(key);

            if (val[0] != 0 && val[1] != 0) {
                intersection += Math.min(val[0], val[1]);
            }

            union += Math.max(val[0], val[1]);
        }

        return (int) (((double) intersection / union) * 65536);
    }

    public List<String> makeList(String str) {

        List<String> result = new ArrayList<String>();

        for (int i = 0; i < str.length() - 1; i++) {
            char ch1 = str.toLowerCase().toCharArray()[i];
            char ch2 = str.toLowerCase().toCharArray()[i + 1];

            if (ch1 < 97 || ch1 > 122 || ch2 < 97 || ch2 > 122) {
                continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(ch1);
            sb.append(ch2);

            result.add(sb.toString());
        }

        return result;
    }

    public static void main(String[] args) {
        new NewsClustering();
    }
}
