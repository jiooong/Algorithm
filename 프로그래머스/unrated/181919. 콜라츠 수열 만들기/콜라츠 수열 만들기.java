import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        while(n>1){
            if(n%2==0){
                n= n/2;
                arr.add(n);
            }else if(n%2==1){
                n = n*3+1;
                arr.add(n);
            }else if(n==1){
                break;
            }
        }
        int[] answer=new int[arr.size()];
        int siz = 0;
        for(int i : arr){
            answer[siz++] = i;
        }
    
        return answer;
    }
}