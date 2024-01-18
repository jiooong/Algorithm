import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        List<Integer> deletelist = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        for(int i : arr){
            if(!deletelist.contains(i)){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}