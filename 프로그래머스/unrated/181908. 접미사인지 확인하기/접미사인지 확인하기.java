import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {

        List<String> str = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            str.add(my_string.substring(i, my_string.length()));
        }

        return str.contains(is_suffix) ? 1 :0;

    }
}