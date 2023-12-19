class Solution {
    public int solution(int a, int b) {
    
        int str = Integer.parseInt(""+a+b);
        int str2 = Integer.parseInt(""+(2*a*b));
        int answer = (str > str2) ? str : str2;
        return answer;
    }
}