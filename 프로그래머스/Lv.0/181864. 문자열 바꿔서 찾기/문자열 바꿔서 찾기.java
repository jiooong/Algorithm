class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        String[] str = myString.split("");
        for(int i=0; i<myString.length(); i++){
            if(str[i].equals("A")){
                sb.append("B");
            }else{
                sb.append("A");
            }
        }

        return sb.toString().contains(pat) ? 1 : 0;
    }
}