class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int hang = arr[0].length;
        int yul = arr.length;
        if(hang > yul){
            answer = new int[hang][hang];
            for(int i=0; i<hang; i++){
                for(int j=0; j<hang; j++){
                    if(i>=yul){
                        answer[i][j]=0;
                    }else{
                    answer[i][j] = arr[i][j];
                    }
                }
            }
        }else{
            answer = new int[yul][yul];
            for(int i=0; i<yul; i++){
                for(int j=0; j<yul; j++){
                    if(j>=hang){
                        answer[i][j]=0;
                    }else{
                    answer[i][j] = arr[i][j];
                    }
                }
            }
            
        }
        return answer;
    }
}