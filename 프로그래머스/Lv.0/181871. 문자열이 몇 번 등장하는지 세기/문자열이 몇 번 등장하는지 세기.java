class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;;
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            String str = myString.substring(i, pat.length()+i);
            if(str.equals(pat)){
                answer += 1;
            }
        }
        return answer;
    }
}