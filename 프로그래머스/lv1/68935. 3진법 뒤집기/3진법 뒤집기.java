import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> num = new ArrayList<>();
        
        while(n>0){            
            num.add(n%3);
            n=n/3;
        }
        // 3진법 변환 
        // 앞뒤 반전 ! 
        System.out.println(num.toString());
        
       int idx = 0;
           for(int j=num.size()-1; j>=0; j--){
            answer+=(Math.pow(3,j)) * num.get(idx);
               idx++;
        }
       

        return answer;
    }
}