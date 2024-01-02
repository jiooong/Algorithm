import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for(int[] i : intervals){
            int a = i[0];
            int b = i[1];
            for(int j=a; j<=b; j++){
                list.add(arr[j]);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}