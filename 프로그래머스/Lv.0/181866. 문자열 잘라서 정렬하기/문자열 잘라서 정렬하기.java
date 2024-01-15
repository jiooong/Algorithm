import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] str = myString.split("x");
        Arrays.sort(str);
        for(String i : str){
            if(!(i.equals(""))){
                list.add(i);
            }
        }
        return list.toArray(new String[list.size()]); 
    }
}