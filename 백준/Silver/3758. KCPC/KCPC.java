import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


class Test{
    int id;
    int[] scoreList;
    int submitNum;
    int lastSubmit;
    int score;

}
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 여러번 제출하는 경우엔 최고 점수가 그 문제에 대한 최종점수다.
        // 팀의 최종점수는 문제에 대해 받은 점수의 총합
        // 팀의 점수가 동일한 경우 풀이 제출 횟수가 적은 팀이 높다 -> 마지막 제출 시간이 더 빠른 팀의 순위가 높다

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){ // 테스트 데이터의 수
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]); // 팀의 개수
            int k = Integer.parseInt(str[1]); // 문제의 개수
            int t = Integer.parseInt(str[2]); // 당신 팀의 ID
            int m = Integer.parseInt(str[3]); // 로그 엔트리 개수

            Test[] list = new Test[n];
            for(int j=0; j<m; j++){ // 로그 엔트리 개수
                String[] str2 = br.readLine().split(" ");
                int i1 =  Integer.parseInt(str2[0]); //  팀 아이디
                int j2 =  Integer.parseInt(str2[1]); // 문제 번호
                int s =  Integer.parseInt(str2[2]); // 획득한 점수

               if(list[i1-1] == null){
                   list[i1-1] = new Test();
                   list[i1-1].id = i1;
                   list[i1-1].scoreList = new int[k+1]; // 문제의 개수 만큼 배열을 만들어
                }
                   list[i1-1].scoreList[j2] = Math.max(s, list[i1-1].scoreList[j2]); // 최대의 수로 바꿔줘
                   list[i1-1].submitNum++;
                   list[i1-1].lastSubmit = j;

            }

            for(int j=0; j<n; j++){
                int sum = 0;
                for(int z=0; z<=k; z++){
                    sum += list[j].scoreList[z];
                }
                list[j].score = sum;
            }

            Arrays.sort(list, new Comparator<Test>(){
                @Override
                public int compare(Test o1, Test o2){
                    if(o1.score == o2.score){
                        if(o1.submitNum == o2.submitNum){
                            return o1.lastSubmit - o2.lastSubmit;
                        }
                        return o1.submitNum - o2.submitNum;
                    }
                    return o2.score - o1.score;
                }
            });
            for(int j = 0; j<n; j++){
                if(list[j].id == t){
                    System.out.println(j+1);
                }
            }

        }
    }
}
