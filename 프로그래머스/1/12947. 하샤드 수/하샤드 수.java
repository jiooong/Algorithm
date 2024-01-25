class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = x+"";
        String[] strArr = str.split("");
        int num = 0;
        for(String i : strArr){
            num += Integer.parseInt(i);
        }
        if(x%num==0){
            answer = true;
        }
        return answer;
    }
}