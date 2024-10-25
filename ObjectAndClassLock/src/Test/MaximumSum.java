package Test;

import java.util.Arrays;

public class MaximumSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int maxSum = findMaxSum(nums);
        System.out.println("Maximum sum: " + maxSum);
    }

    public static int findMaxSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int[] dp = new int[n];

        // Base cases
        dp[0] = nums[0];
        if (n > 1)
            dp[1] = Math.max(nums[0], nums[1]);

        // Dynamic programming to find the maximum sum
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        // The last element of dp array contains the maximum sum
        return dp[n - 1];
    }
}
