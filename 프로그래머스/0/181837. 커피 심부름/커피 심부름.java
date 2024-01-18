class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String i : order){
            if(i.contains("americano")){
                answer+=4500;
            }else if(i.contains("cafelatte")){
                answer += 5000;
            }else if(i.equals("anything")){
                answer += 4500;
            }
        }
        return answer;
    }
}