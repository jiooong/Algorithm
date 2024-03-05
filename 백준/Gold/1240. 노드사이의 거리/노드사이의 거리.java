import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static int[] visited;
    static void BFS(int s, int e, int n){
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[n+1];

        queue.add(s);
        visited[s] = 1;

        while(!queue.isEmpty()){
            int target = queue.poll();
            for(int i=1; i<=n; i++){
                if(arr[target][i] > 0 && visited[i]==0){
                    queue.add(i);
                    visited[i] = 1;
                    distance[i] = distance[target] + arr[target][i];
                    if (i == e) {
                        System.out.println(distance[i]);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    arr = new int[N+1][N+1];
    visited = new int[N+1];

    for(int i = 0; i<N-1; i++){
        st = new StringTokenizer(br.readLine());
        int from =Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        arr[from][to] = num;
        arr[to][from] = num;
    }

    for(int i = 0; i<M; i++){
        st = new StringTokenizer(br.readLine());
        int start =Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        Arrays.fill(visited, 0);

        BFS(start, end, N);
    }
    }
}