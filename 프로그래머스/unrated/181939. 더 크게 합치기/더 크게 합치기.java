class Solution {
    public int solution(int a, int b) {
        String str = Integer.toString(a);
        String str2 = Integer.toString(b);
        String num = str + str2;
        String num2 = str2 + str;
        int answer = (Integer.parseInt(num)>Integer.parseInt(num2)) ? Integer.parseInt(num):Integer.parseInt(num2);
        return answer;
    }
}