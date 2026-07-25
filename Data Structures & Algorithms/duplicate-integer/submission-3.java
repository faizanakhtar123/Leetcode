class Solution {
    public boolean hasDuplicate(int[] nums) {
        int [] freq = new int[1001];
        for(int ele : nums){
            freq[ele]++;
            if(freq[ele]>1) return true;
        }
        return false;
    }
}