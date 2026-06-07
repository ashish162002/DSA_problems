import java.util.*;

class Solution {

    private int cross(int[] o, int[] a, int[] b) {
        return (a[0] - o[0]) * (b[1] - o[1]) -
               (a[1] - o[1]) * (b[0] - o[0]);
    }

    public int[][] outerTrees(int[][] trees) {

        int n = trees.length;

        Arrays.sort(trees, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        List<int[]> lower = new ArrayList<>();
        List<int[]> upper = new ArrayList<>();

        // Lower hull
        for (int[] p : trees) {
            while (lower.size() >= 2 &&
                   cross(lower.get(lower.size() - 2),
                         lower.get(lower.size() - 1),
                         p) < 0) {
                lower.remove(lower.size() - 1);
            }
            lower.add(p);
        }

        // Upper hull
        for (int i = n - 1; i >= 0; i--) {
            int[] p = trees[i];

            while (upper.size() >= 2 &&
                   cross(upper.get(upper.size() - 2),
                         upper.get(upper.size() - 1),
                         p) < 0) {
                upper.remove(upper.size() - 1);
            }
            upper.add(p);
        }

        Set<String> set = new HashSet<>();
        List<int[]> res = new ArrayList<>();

        for (int[] p : lower) {
            String key = p[0] + "," + p[1];
            if (set.add(key)) res.add(p);
        }

        for (int[] p : upper) {
            String key = p[0] + "," + p[1];
            if (set.add(key)) res.add(p);
        }

        return res.toArray(new int[res.size()][]);
    }
}