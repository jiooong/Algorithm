// class Solution {
//     public int solution(String[] strArr) {
//         int max=0;
//         int[] arr = new int[30];
//         for(int i=0; i<strArr.length; i++){
//             arr[strArr[i].length()] += 1;
//         }

//         for(int i : arr){
//             if(i > max){
//                 max = i;
//             }
//         }
        
//         return max;
//     }
// }
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        int[] lenArr = new int[30];
        for(int i = 0; i < strArr.length; i++) {
            lenArr[strArr[i].length()-1]++;
        }

        for(int num : lenArr) {
            if(answer < num) answer = num;
        }


        return answer;
    }
}