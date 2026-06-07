import java.util.*;

class Solution {
    public List<Integer> pathInZigZagTree(int label) {

        List<Integer> res = new ArrayList<>();

        int node = label;
        int level = 0;

        // find level of label
        while ((1 << level) <= node) {
            level++;
        }
        level--;

        while (node >= 1) {

            res.add(node);

            int start = 1 << level;
            int end = (1 << (level + 1)) - 1;

            // convert zigzag label to normal label
            node = start + end - node;

            node /= 2;
            level--;
        }

        Collections.reverse(res);
        return res;
    }
}