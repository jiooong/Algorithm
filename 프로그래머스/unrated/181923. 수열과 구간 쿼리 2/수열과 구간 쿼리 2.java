import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        for(int[] i : queries){
            int x = i[0];
            int y = i[1];
            int z = i[2];
            List<Integer> list = new ArrayList<>();
            for(int j = x; j<=y; j++){
                if(arr[j] > z){ 
                    list.add(arr[j]);
                }      
                }
            if(list.size()==0){
                answer[count] = -1;
            }else{
                answer[count] = Collections.min(list);
            }
            count+=1;
            }
         return answer;
        }       
    } 
