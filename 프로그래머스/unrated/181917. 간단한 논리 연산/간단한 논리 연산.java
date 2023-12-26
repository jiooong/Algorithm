class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        Boolean answer;
         // 언더 연산은 둘중 하나라도 true면 true !
         // 위로 연산은 둘 중 하나라도 false면 false

        if(x1 || x2) {
            if((x3 || x4) == false){
                answer = false;
            }else{
                answer = true;
            }
            
        }else{
            if((x3 || x4) == false){
                answer = false;
            }else{
                answer = false;
            }
            
        }
        
        return answer;

    }
}