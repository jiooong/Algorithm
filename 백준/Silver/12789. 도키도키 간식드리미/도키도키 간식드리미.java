import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        Deque<Integer> deque = new LinkedList<>();
        for(String s : str) {
            deque.addLast(Integer.parseInt(s));
        }

        Stack<Integer> stack = new Stack<>();

        int small = 1;
        while(!deque.isEmpty()) {
            int second = deque.peekFirst();
            if(second == small) {
                deque.pollFirst();
                small++;
            } else if(!stack.isEmpty() && small == stack.peek()) {
                stack.pop();
                small++;
            } else {
                stack.push(deque.pollFirst());
            }
        }

        while(!stack.isEmpty()) {
            int second = stack.peek();
            if(second == small) {
                stack.pop();
                small++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
