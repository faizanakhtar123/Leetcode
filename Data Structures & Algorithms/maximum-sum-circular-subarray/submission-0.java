class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         int totalSum = 0,currSumMax=nums[0],currSumMin=nums[0],minSum=nums[0],maxSum=nums[0];
        totalSum = nums[0];
        for(int i=1;i<nums.length;i++){
            totalSum +=nums[i];
            currSumMax = Math.max(currSumMax+nums[i],nums[i]);
            maxSum = Math.max(maxSum,currSumMax);
            currSumMin = Math.min(currSumMin+nums[i], nums[i]);
            minSum = Math.min(minSum,currSumMin);
        }
        if(maxSum<0) return maxSum;
        return Math.max(maxSum, totalSum-minSum);
    }
}