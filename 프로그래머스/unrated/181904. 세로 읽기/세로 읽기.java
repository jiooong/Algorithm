import java.util.*;

class Solution {
public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] words = my_string.split("");
        int count = 0;
        
        String[][] arr = new String[words.length/m][m];
        
        for (int i = 0; i < words.length/m; i++) {
            for (int j = 0; j < m; j++) {
                if (count < words.length) {
                    arr[i][j] = words[count];
                    count++;
                }
            }
        }
    
        for (int z = 0; z < arr.length; z++) {
            if (arr[z][c-1] != null) {
                answer += arr[z][c-1];
            }
        }
    
        return answer;
    }
}