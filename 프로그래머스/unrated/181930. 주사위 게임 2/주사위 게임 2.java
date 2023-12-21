class Solution {
    public int solution(int a, int b, int c) {
        if(a!=b & a!=c & b!=c){
            return a+b+c;
        }else if(a==b & a==c & b==c){
            return (a+b+c) * ((a*a) + (b*b) + (c*c)) *((a*a*a) + (b*b*b) + (c*c*c));
        }else if((a == b & b!=c) || (a==c & b!=c) || (b==c & a!=b)){
            return (a+b+c) * ((a*a) + (b*b) + (c*c));
        }
        return 0;
    }
}