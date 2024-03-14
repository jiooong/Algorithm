import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
             
        for(int i=0; i<commands.length; i++){
            int first = commands[i][0];
            int second = commands[i][1];
            int third = commands[i][2];
            
            int[] newarr = Arrays.copyOfRange(array, first-1,second);
            Arrays.sort(newarr);
            answer[i] = newarr[third-1];
        }
             return answer;
        }
    }
