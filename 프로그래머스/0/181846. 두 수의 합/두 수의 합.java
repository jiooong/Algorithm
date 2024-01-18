import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger numa = new BigInteger(a);
        BigInteger numb = new BigInteger(b);
        BigInteger sum = numa.add(numb);
        
        return ""+sum;
    }
}