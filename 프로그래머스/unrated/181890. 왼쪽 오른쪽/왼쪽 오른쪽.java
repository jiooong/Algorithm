import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int check = 0;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l") && check == 0){
                answer = Arrays.copyOfRange(str_list, 0, i);
                check =1;
            }else if(str_list[i].equals("r") && check == 0){
                answer = Arrays.copyOfRange(str_list, i+1, str_list.length);
                check =1;
            }
        }
        return answer;
    }
}