
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 2부터 n까지의 수 
        for(int i=2; i<=n; i++){ 
            
            boolean check = true;
            
            // 만약 5라고 가정 -> J:2,3까지 ! 
            // 6이라고 가정 -> 2
            for(int j=2; j<=Math.sqrt(i); j++){
                //5를 2,3으로 나누면 나누어 떨어지지 않자나 --> 소수 
                //6은 2로 나누어 떨어진다 -> 소수가 아니다 ! break
                if(i%j==0) {
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }
        }     
        return answer;
    }
}