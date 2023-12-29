import java.util.StringTokenizer;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(binomial);
        int a = Integer.parseInt(st.nextToken());
        String num = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        
        if(num.equals("-")){
            answer = a-b;
        }else if(num.equals("*")){
            answer = a*b;
        }else if(num.equals("+")){
            answer = a+b;
        }

        return answer;
    }
}