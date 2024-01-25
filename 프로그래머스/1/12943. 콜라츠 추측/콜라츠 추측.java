class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(answer <= 500){
            
            if(num == 1){
                break;
            }else if(num < 0){
                answer = -1;
                break;
            }
            
            if(num%2==0){
                num = num/2;
            }else{
                num = num*3+1;
            }
            
            answer++;
        }

        return answer;
    }
}