import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        return list.contains(n) ? 1 :0;
    }
}