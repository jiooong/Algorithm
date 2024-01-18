class Solution {
    public int[] solution(int[] arr, int k) {
        int num = 0;
        if(k%2==1){
            for(int i=0; i<arr.length; i++){
                arr[i] = k*arr[i];
            }
        }else{
            for(int i=0; i<arr.length; i++){
                arr[i] = k+arr[i];
            }
        }
        return arr;
    }
}