class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str="";
        String str2="";
        for(int i : num_list){
            if(i%2==0){
                str += ""+i;
            }else{
                str2 += ""+i;
            }
        }
        return Integer.parseInt(str) + Integer.parseInt(str2);
    }
}