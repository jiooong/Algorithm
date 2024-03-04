import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> arrayList;
    static boolean[] check;

    public static void DFS(int v){
        check[v] = true;
        System.out.print(v + " ");
        for(int i : arrayList.get(v)){
            if(check[i]==false){
                DFS(i);
            }
        }
    }

    public static void BFS(int v){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        check[v] = true;
        while(!queue.isEmpty()){
            int target = queue.poll();
            System.out.print(target +" ");
            for(int i: arrayList.get(target)){
                if(check[i]==false){
                    queue.add(i);
                    check[i] = true;
                }
            }
        }




    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        arrayList = new ArrayList<>();
        check = new boolean[N+1];

        //리스트 초기화
        for(int i=0; i<=N; i++){
            arrayList.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            arrayList.get(first).add(second);
            arrayList.get(second).add(first);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(arrayList.get(i));
        }
        
        DFS(V);
        Arrays.fill(check, false);
        System.out.println();
        BFS(V);
    }
}