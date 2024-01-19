class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int karo = n-1;
        int sero = n-1;
        int startkaro = 0;
        int startsero = 0;

        while(num <= n*n){
            // 좌 -> 우
            for(int i=startkaro; i<= karo; i++){
                answer[startsero][i] = num;
                num +=1;
            }
            startsero++;
            
            for(int j=startsero; j<=sero; j++){
                answer[j][karo] = num;
                num+=1;
            }
            karo--;

            for(int z=karo; z>=startkaro; z--){
                answer[sero][z] = num;
                num+=1;
            }
            sero--;

            for(int k=sero; k>=startsero; k--){
                answer[k][startkaro] = num;
                num+=1;
            }
            startkaro++;

        }
        return answer;
    }
}