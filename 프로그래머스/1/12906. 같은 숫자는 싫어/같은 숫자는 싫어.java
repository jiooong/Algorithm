import java.util.*;

class Solution{
	public static int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i : arr){
            if(st.isEmpty()){
                st.push(i);
            }else{
                if(st.peek()!=i){
                    st.push(i);
                }
            }
        }
        int[] answer = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            answer[i] = st.pop(); 
        }
        return answer;
     }
}