import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length;
        int idx = 1;
        while(true){
            if(len > Math.pow(2, idx)){
                idx += 1;
            }else if(len == Math.pow(2, idx)){
                break;
            }else if(len < Math.pow(2,idx)){
                break;
            }
        }

        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if(list.size()==1){
            return list.stream().mapToInt(i->i).toArray();
        }else{
        int remaining = (int)Math.pow(2,idx) - len;
        for(int i=0; i<remaining; i++){
            list.add(0);
        }}

        return list.stream().mapToInt(i->i).toArray();
    }
}