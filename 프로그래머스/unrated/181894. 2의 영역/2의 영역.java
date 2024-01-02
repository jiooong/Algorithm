import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arrList.size(); i++){
            if(arrList.get(i)==2){
                list.add(arrList.get(i));
                arrList.set(i,0);
            }else if(list.size()>0 && arrList.contains(2)){
                list.add(arrList.get(i));
                 arrList.set(i,0);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        if(answer.length==0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}