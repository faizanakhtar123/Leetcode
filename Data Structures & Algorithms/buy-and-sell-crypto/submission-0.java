class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int low = 0 , high = 0;
        int maxProfit = 0;
        while(high<n){
            if(nums[high]<nums[low]) low=high;
            else {
                int profit = nums[high] - nums[low];
                maxProfit = Math.max(maxProfit,profit);
            }
            high++;
        }
        return maxProfit;
    }
}
