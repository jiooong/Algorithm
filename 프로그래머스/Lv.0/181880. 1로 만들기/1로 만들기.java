class Solution {
    public int solution(int[] num_list) {
        int answer = 0 ;
        int count = 0;
        while(true){
            count = 0;
            for(int i=0; i<num_list.length; i++){
                if((num_list[i]%2==0) && (num_list[i] != 1)){
                    num_list[i] = num_list[i]/2;
                    answer += 1; 
                }else if((num_list[i]%2==1) && (num_list[i] != 1)){
                    num_list[i] = (num_list[i]-1)/2;
                    answer += 1;
                }else if(num_list[i] == 1){
                    count+=1;
                }
            }
            
            if(count == num_list.length){
                break;
            }

        }
        return answer;
    }
}