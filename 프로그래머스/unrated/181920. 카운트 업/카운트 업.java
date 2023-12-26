import java.util.ArrayList;
class Solution {
    
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = start_num; i<=end_num; i++){
            arrList.add(i);
        }
        
        int[] arr = new int[arrList.size()];
        int size = 0;
        for(int j : arrList){
            arr[size++] = j;
        }
        
        
        return arr;
    }
}