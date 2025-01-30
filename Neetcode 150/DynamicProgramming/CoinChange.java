
// class Solution {

/*
 * Coin change problem
 * https://leetcode.com/problems/coin-change-ii/
 * Using for loop and Memoization
 * 
*/

import java.util.Arrays;

class CoinChange {
    public int solve(int amount, int[] coins, int i, int[][] dp) {
        if (i >= coins.length)
            return 0;
        if (amount < 0)
            return 0;
        if (amount == 0)
            return 1;
        if (dp[i][amount] >= 0)
            return dp[i][amount];
        int res = 0;
        for (int start = i; start < coins.length; start++) {
            res += solve(amount - coins[start], coins, start, dp);
        }
        dp[i][amount] = res;
        return res;
    }

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(amount, coins, 0, dp);
    }
}