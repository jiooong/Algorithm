
class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for(int[] i : queries){
            
            int start = i[0];
            int end = i[1];
            String str = "";
            for(int j=start; j<=end; j++){
                str += (arr[j]+"");
            }
            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString(); 
            char[] arr2 = reverse.toCharArray();

            
            for(int z = 0; z < end-start+1; z++){
                arr[z+start] = arr2[z];
            }
            
        }


        StringBuilder answer = new StringBuilder();
        for (char c : arr) {
            answer.append(c);
        }

        return answer.toString();
    }
}
