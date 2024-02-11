class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1; i<= n/2; i++){
            int sum = 0;
            for(int j = i; sum<n; j++){
                sum += j;
                if(sum == n){
                    answer += 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}