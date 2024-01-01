import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        // 문자열의 해당하는 인덱스의 수를 지워버리고싶다 ! 
        Arrays.sort(indices);
        String[] arr = my_string.split("");
        StringBuilder as = new StringBuilder();
        List<Integer> list = Arrays.stream(indices).boxed().collect(Collectors.toList());
        for(int j = 0; j<my_string.length(); j++){
            if(!(list.contains(j))){
                as.append(arr[j]);
            }
        }
        return as.toString();
    }
}