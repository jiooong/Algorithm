import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        // arr 배열 (원본 배열) , answer 배열
        for(int[] i : queries) {
            int x = i[0];
            int y = i[1];
            int z = i[2];
            
            for(int j = x; j <= y; j++){
                if(j % z==0){
                    answer[j] += 1;
                }
            }
        }
        return answer;
    }
}