import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answerBuilder = new StringBuilder();
        
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : X.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : Y.toCharArray()) {
            if (freqMap.containsKey(c) && freqMap.get(c) > 0) {
                answerBuilder.append(c);
                freqMap.put(c, freqMap.get(c) - 1);
            }
        }

        
        String answer = answerBuilder.toString();
        String[] charArray = answer.split("");
        Arrays.sort(charArray, Collections.reverseOrder());
        answer = String.join("",charArray);

        if (answer.isEmpty()) {
            return "-1";
        } else if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer;
        }
    }
}
