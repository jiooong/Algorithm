class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;
         for (int i=3; i<size; i++) {
            for (int j=3; j<size; j++) {
                if (i*j == size && i>=j && (i-2) * (j-2) == yellow) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}
