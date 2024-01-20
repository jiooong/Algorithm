class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pNum = 0;
        int sNum = 0;
        
        for(int i=0; i<s.length(); i++){
            
            char target = s.charAt(i);
            
            if(target == 'p' || target=='P'){
                pNum+=1;                
            }else if (target == 'y' || target=='Y'){
                sNum+=1;
            }
        }
        
        if (pNum == sNum){
            return answer;
        } else {
            return !answer;
        }
        
    }
}