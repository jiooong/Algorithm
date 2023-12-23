import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        
        List<Integer> list = new ArrayList<>();
        // 각 자리 마다 있고 없고의 경우의 수 => 0,1
        for(int i = l; i <= r; i++){
            if(!((i+"").contains("1") || (i+"").contains("2") || (i+"").contains("3") || (i+"").contains("4") || (i+"").contains("6") || (i+"").contains("7") || (i+"").contains("8") || (i+"").contains("9"))){
                list.add(i);
            }else if(list.size()==0 && i == r){
                list.add(-1);    
            }
        }
        int[] answer = new int[list.size()];

        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
    
        return answer;
    
    }
}