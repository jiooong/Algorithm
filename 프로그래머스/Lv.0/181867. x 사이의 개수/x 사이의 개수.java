import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        String[] str = myString.split("x",myString.length());
        for(String i : str){
            list.add(i.length());
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}