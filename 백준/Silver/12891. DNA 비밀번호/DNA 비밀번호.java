import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    static int answer;
    static String[] s = {"A", "C", "G", "T"};
    public static void checking(Map<String, Integer> map, Map<String, Integer> count){
        for(int i=0; i<4; i++){
            if(map.get(s[i]) > count.get(s[i])){
                return;
            }
        }
            answer ++;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int S = Integer.parseInt(str[0]);
        int P = Integer.parseInt(str[1]);

        String[] dnastr = br.readLine().split("");

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>(); // 있어야 하는 값
        Map<String, Integer> count = new HashMap<>(); // 확인하려고 저장하는 값

        for(String ss : s) {
            map.put(ss, Integer.parseInt(st.nextToken()));
            count.put(ss, 0);
        }

        for(int i=0; i<P; i++){
            count.put(dnastr[i], count.get(dnastr[i]) + 1);
        }
        checking(map,count);

        for(int i=1; i<=S-P; i++){
            count.put(dnastr[i-1], count.get(dnastr[i-1]) - 1); // 이전의 값은 - 1 빼주고
            count.put(dnastr[i+P-1], count.get(dnastr[i+P-1]) + 1); // 다음 값은  + 1 넣허줘
            checking(map,count);
        }


        System.out.println(answer);
    }
}
