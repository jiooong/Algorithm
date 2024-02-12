import java.util.*;
class Solution {
public int solution(String s) {
String answer = "";
String str = "";
Map<String,String> map = new HashMap<>();
map.put("zero","0");
map.put("one","1");
map.put("two","2");
map.put("three","3");
map.put("four","4");
map.put("five","5");
map.put("six","6");
map.put("seven","7");
map.put("eight","8");
map.put("nine","9");

for(int i=0;i<s.length();i++){
if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
answer += s.charAt(i);
}else{
str = str + s.charAt(i);
if(map.containsKey(str)){
answer += map.get(str);
str = "";
}
}
}

return Integer.parseInt(answer);
}
}