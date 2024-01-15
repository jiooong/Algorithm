import java.util.ArrayList;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        while(arr.length > idx){
            if(list.size()==0){
                list.add(arr[idx]);
                idx+=1;
            }else if((list.size()!=0) && (list.get(list.size()-1)==arr[idx])){
                list.remove(list.size()-1);
                idx+=1;
            }else if((list.size()!=0) && (list.get(list.size()-1)!=arr[idx])){
                list.add(arr[idx]);
                idx+=1;
            }
        }
        return list.size()==0 ? new int[]{-1} : list.stream().mapToInt(i->i).toArray();
    }
}