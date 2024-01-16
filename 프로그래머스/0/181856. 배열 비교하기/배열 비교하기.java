class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer;
        int addNum = 0; 
        int addNum2 = 0;
        if(arr1.length == arr2.length){
            for(int i : arr1){
                addNum += i;
            }
            for(int j : arr2){
                addNum2 += j;
            }
            if(addNum == addNum2){
                answer = 0;
            }else if(addNum > addNum2){
                answer = 1;
            }else{
                answer = -1;
            }
        }else{
            if(arr1.length > arr2.length){
                answer = 1;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}