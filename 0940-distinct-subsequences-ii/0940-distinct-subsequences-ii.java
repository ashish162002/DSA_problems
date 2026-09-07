class Solution {
    public int distinctSubseqII(String s) {

        int MOD = 1000000007;
        int n = s.length();

        // dp[i] = number of distinct subsequences
        // using first i characters, including empty subsequence
        long[] dp = new long[n + 1];

        dp[0] = 1;

        // Last occurrence of each character
        int[] last = new int[26];

        for (int i = 0; i < 26; i++) {
            last[i] = -1;
        }

        for (int i = 1; i <= n; i++) {

            int c = s.charAt(i - 1) - 'a';

            // Double the previous subsequences
            dp[i] = (2 * dp[i - 1]) % MOD;

            // Remove duplicate subsequences
            if (last[c] != -1) {
                dp[i] = (dp[i] - dp[last[c] - 1] + MOD) % MOD;
            }

            // Update last occurrence
            last[c] = i;
        }

        // Remove empty subsequence
        return (int) ((dp[n] - 1 + MOD) % MOD);
    }
}