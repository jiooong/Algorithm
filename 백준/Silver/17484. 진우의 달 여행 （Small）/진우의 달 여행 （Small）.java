import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int N;
    static int M;
    static int[] movingY= {-1, 0, 1};
    static int[][] visited;
    static int[][] arr;
    static int small;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        arr = new int[N][M]; // 입력 받음
        for(int i=0; i<N; i++){
            String[] strs = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                int m = Integer.parseInt(strs[j]);
                arr[i][j] = m;
            }
        }

     
        small = Integer.MAX_VALUE; // 초기값을 최대로 설정
        for(int i=0; i<M; i++){
            
            DFS(0,i,arr[0][i],-1);
        }
        System.out.println(small);
    }
    public static void DFS(int x, int y, int addn, int dir){
        if(x==N-1){
            if(addn < small){
                small = addn;
            }
            return;
        }
        for(int i=0; i<3; i++){
            int nextY = y + movingY[i];
            if(nextY >= 0 && nextY < M && dir != i){
                DFS(x+1, nextY, addn + arr[x+1][nextY], i );
            }
        }
    }
}
