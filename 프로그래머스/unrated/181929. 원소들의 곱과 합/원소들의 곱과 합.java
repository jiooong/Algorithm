class Solution {
    public int solution(int[] num_list) {
        int addNum=0;
        int mulNum=1;
        for(int num : num_list){
            addNum += num;
            mulNum *= num;
        }
        return ((addNum*addNum) > mulNum)?1:0;
    }
}