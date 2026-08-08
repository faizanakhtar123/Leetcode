class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int [] dp1 = new int[n];
        int [] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int startZero= amount(nums,0,n-2,dp1);
        int startOne = amount(nums,1,n-1,dp2);
        return Math.max(startZero,startOne);
    }
    private int amount(int[]nums, int start , int end, int[]dp){
        if(start>end) return 0;
        if(dp[start]!=-1) return dp[start];
        int take = nums[start] + amount(nums,start+2,end,dp);
        int skip = amount(nums,start+1,end,dp);
        return dp[start]=Math.max(take,skip);
    }
}
