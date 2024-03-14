class Solution {
    static int answer = 0;
    static int n;
    static int r = 0;
    
    public int solution(int[] number) {
        n = number.length;
        combination(number, 0, n, r, 0);
        return answer;
    }
    
    static void combination(int[] number, int start, int n, int r, int sum){
        if(r==3){
            if(sum == 0){
                answer ++;
            }
            return;
        }
        for(int i=start; i<n; i++){
            System.out.println(number[i]);
            combination(number, i+1, n, r+1, sum+number[i]);
        }
    }
    
}