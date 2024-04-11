public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= 0){
            int left = n / a;
            if (left == 0) break; // 콜라가 더 이상 없을 때 반복문 종료
            n -= left * a; // 가져간 콜라 수만큼 빼준다.
            answer += left * b; // 가지고 간 콜라의 가격을 더한다.
            n += left * b;
        }
        return answer;
    }
}
