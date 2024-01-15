import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(!list.contains(i)){
                list.add(i);
            }
        }

        int remaining = k - list.size();
        for (int i = 0; i < remaining; i++) {
            list.add(-1);
        }
        
        return list.subList(0,k).stream().mapToInt(i->i).toArray();
    }
}