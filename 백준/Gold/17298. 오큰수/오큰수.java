
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] ars) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] answer = new int[num];
        Stack<Integer> stack = new Stack<>();


        for(int i=0; i<num; i++){
            answer[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<num; i++) {
            while (!stack.isEmpty() && answer[stack.peek()] < answer[i]) {
                answer[stack.pop()] = answer[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder ansstring = new StringBuilder();
        for (int i = 0; i < num; i++) {
            ansstring.append(answer[i]).append(" ");
        }

        System.out.println(ansstring.toString());
    }
}

