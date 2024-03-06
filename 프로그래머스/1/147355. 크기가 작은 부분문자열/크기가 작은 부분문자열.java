class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int leng = p.length();
        
        for(int i=0; i<=t.length()-leng; i++){
            String nt = t.substring(i,i+leng);
            System.out.println(nt);
            if(Long.parseLong(nt) <= Long.parseLong(p)){
                answer++;
            }
        } 
        
        return answer;
    }
}