import java.util.*;

class Solution{
	public static int[] solution(int[] arr) {     
        ArrayList<Integer> arrays = new ArrayList<>();
        arrays.add(arr[0]);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                arrays.add(arr[i+1]);
            }
        }
        
  return arrays.stream().mapToInt(Integer::intValue).toArray();
     }
}
