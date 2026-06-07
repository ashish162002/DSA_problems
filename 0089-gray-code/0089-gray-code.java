import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<>();
        result.add(0);

        for (int i = 0; i < n; i++) {

            int size = result.size();
            int add = 1 << i;

            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) + add);
            }
        }

        return result;
    }
}