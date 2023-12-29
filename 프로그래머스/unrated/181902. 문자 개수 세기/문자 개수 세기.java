class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        //65->90 // 97 -> 122 
            for(int j=0; j<my_string.length(); j++){
                char num = my_string.charAt(j);
                if('A'<=num && num<='Z'){
                    answer[num-65] += 1;
                }else if('a'<=num&& num<='z'){
                    answer[num-97+26] += 1;
                }
            }
        
        return answer;
    }
}