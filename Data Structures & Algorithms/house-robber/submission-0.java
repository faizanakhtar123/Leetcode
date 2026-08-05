class Solution {
    int [] dp;
    public int solve(int [] nums , int i){
        if(i<0) return 0;
         if (i == 0) return nums[0];
        if(dp[i]!=-1) return dp[i];
        int skip = solve(nums,i-1);
        int take = nums[i] + solve(nums,i-2);
        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,n-1);
    }
}
