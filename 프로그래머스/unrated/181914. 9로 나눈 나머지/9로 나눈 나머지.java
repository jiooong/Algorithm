class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] arr = number.toCharArray();
        for(char i : arr){
            answer += i-'0';
        }
        return answer % 9;
    
    }
}