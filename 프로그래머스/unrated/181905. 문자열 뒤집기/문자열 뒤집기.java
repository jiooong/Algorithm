import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0,s));
        String str = my_string.substring(s,e+1);
        StringBuilder sb2 = new StringBuilder(str);
        sb.append(sb2.reverse());
        sb.append(my_string.substring(e+1, my_string.length()));
        return sb.toString();
    }
}