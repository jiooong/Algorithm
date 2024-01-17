class Solution {
    public int solution(double flo) {
        String strr = flo + "";
        String[] str = strr.split("[\\.]");
        return Integer.parseInt(str[0]);
    }
}