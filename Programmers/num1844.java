import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        return BFS(maps,0,0);
    }
    
    public int BFS(int[][]maps, int i, int j){ // 맵의 정보받기 , 오른쪽 또는 아래,위로만 이동이 가능하다, 방문했으면 변경할 배열 하나 더 만들기 
        int[] dx ={0,1,0,-1};
        int[] dy ={1,0,-1,0};
        
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        que.offer(new int[] {i,j});
        
        while(!que.isEmpty()){
            int[] current = que.poll();
            visited[0][0]=true;
           
            for(int k=0; k<4; k++){
                 
            int x = current[0] + dx[k]; 
            int y = current[1] + dy[k];
            
                if(x>=0 && y>=0 && x<maps.length && y<maps[0].length){
                    if(maps[x][y]!=0 && !visited[x][y]){
                        visited[x][y] = true;
                        maps[x][y] = maps[current[0]][current[1]] +1;
                        que.add(new int[]{x,y});
                    }                   
                }
            } 
        } 
        if(!visited[maps.length-1][maps[0].length-1]==true){
            return -1;
        }
    return maps[maps.length-1][maps[0].length-1]; 
  }
}
