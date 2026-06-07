import java.util.*;

class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        List<Integer> res = new ArrayList<>();

        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += arr1[i--];
            }

            if (j >= 0) {
                sum += arr2[j--];
            }

            // Normalize sum for base -2
            if (sum >= 2) {
                res.add(sum - 2);
                carry = -1;
            } 
            else if (sum >= 0) {
                res.add(sum);
                carry = 0;
            } 
            else { // sum == -1
                res.add(1);
                carry = 1;
            }
        }

        // Remove leading zeros
        while (res.size() > 1 && res.get(res.size() - 1) == 0) {
            res.remove(res.size() - 1);
        }

        Collections.reverse(res);

        int[] ans = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            ans[k] = res.get(k);
        }

        return ans;
    }
}