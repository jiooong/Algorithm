class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pnum = 0; 
        int ynum = 0;
        s = s.toLowerCase();
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("p")){
                pnum+=1;
            }else if(str[i].equals("y")){
                ynum+=1;
            }
        }
        
        if(pnum == 0 && ynum == 0){
            answer = true;
        }else{
            if(pnum!=0 || ynum!=0){
             if(pnum==ynum){
                answer = true;
            }
            }
        }
            
        return answer;
    }
}