
import java.util.Stack;


class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<flag.length; i++ ){

            if(flag[i]==true){
                for(int j=0; j<arr[i]*2; j++){
                    st.push(arr[i]);
                }
            }else{
                for(int j=0; j<arr[i]; j++){
                    st.pop();
                }
            }
            
        }
        
        return st.stream().mapToInt(i->i).toArray();
    }
}