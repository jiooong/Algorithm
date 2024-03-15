import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
// 연산이 10억 -> 1억
// 가중치가 있는 인접리스트를 만들때는 클래스를 하나 더 만들기 가중치, 정점
class Edge {
     int weight;
     int v;
     public Edge(int weight, int v){
         this.weight = weight;
         this.v = v;
     }
}

public class Main {
    static ArrayList<ArrayList<Edge>> arrayList;
    public static boolean DFS(int fac1, int fac2,boolean[] check, int middle) {
        // 종료조건 : 최대값 ! -> 전부 탐색하면서 이분탐색을 사용해 최대값을 구해야함
        // 중량값을 이분탐색하고 DFS 로 탐색가능한지 여부 판별해줘라
        // 방문가능하고 값이 더 크다면
        if (fac1 == fac2) {
            return true;
        }

        check[fac1] = true;

        for (Edge edge : arrayList.get(fac1)) {
            if (check[edge.v] == false && edge.weight >= middle) {
                if(DFS(edge.v, fac2, check, middle)){
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) throws IOException {
        // 양방향 그래프 문제
        //1. 섬 정보 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        boolean[] check = new boolean[N+1];
        //2. 받은 인풋 정보로 가중치가 있는 양방향 그래프 만들기
        arrayList = new ArrayList();
        for(int i=0; i<=N; i++){
            arrayList.add(new ArrayList<>());
        }

        int max = 0;
        for(int i=0; i<M; i++){
            String[] strs = br.readLine().split(" ");
            int A = Integer.parseInt(strs[0]);
            int B = Integer.parseInt(strs[1]);
            int C = Integer.parseInt(strs[2]);

            // 양방향 가중치
            arrayList.get(A).add(new Edge(C,B));
            arrayList.get(B).add(new Edge(C,A));
            max = Math.max(C, max);
        }

        // 공장이 위치해 있는 섬의 번호 찾기
        String[] strss = br.readLine().split(" ");
        int fac1 = Integer.parseInt(strss[0]);
        int fac2 = Integer.parseInt(strss[1]);
        // 최대의 중량값을 찾아놓은 후 dfs 를 통해 해당 하는 값이 가능한 값인지 확인하기

        int start = 1;
        int end = max;
        int result = 0;

        while(start <= end){
            int middle = (start + end)/2;

            check = new boolean[N+1];

            if(DFS(fac1, fac2, check, middle)){ // 만약 방문가능하고 값이 더 크다면
                result = middle;
                start = middle+1;
            }else{
                end = middle-1;
            }
        }
        System.out.println(result);
    }
}
