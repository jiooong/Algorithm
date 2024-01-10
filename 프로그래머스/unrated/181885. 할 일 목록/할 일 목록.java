import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer;
        List<String> list = new ArrayList<>();

        for(int i=0; i<todo_list.length; i++){
            if(finished[i] == false){
                list.add(todo_list[i]);
            }
        }

        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}