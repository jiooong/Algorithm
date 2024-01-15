import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        for(String i : str){
            if(!(i.equals(""))){
                list.add(i);
            }
        }
        return str.length == 0 ? new String[]{"EMPTY"} : list.toArray(new String[list.size()]);
    }
}