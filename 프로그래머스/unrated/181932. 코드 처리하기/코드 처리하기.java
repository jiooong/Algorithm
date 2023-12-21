
class Solution {
    public String solution(String code) {
        String answer = "";
        //시작은 mode 0 -> 1을 만나면 mode가 변경된다.
        //mode가 0 이면 인덱스가 짝수 인 경우 ret의 제일 뒤에 추가한다
        //mode가 1 이면 인덱스가 홀수인 경우 제일 뒤에 추가한다.
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            Character str = code.charAt(i);
            if(str == '1'){ //?????????????????????????
                mode = (mode == 0) ? 1 : 0;
            }else{
                if(mode == 0){
                    if(i%2==0){
                        answer+=str;        
                    }  
                }else{
                    if(i%2==1){
                        answer+=str;
                    }
                }
            }
        }
        return answer.length()==0?"EMPTY":answer;
    }
}