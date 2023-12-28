class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder(my_string.substring(my_string.length() - n, my_string.length()));
        
        return sb.toString();
    }
}