class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
        boolean [] bool = new boolean[n+1];
        for(int ele : nums){
            bool[ele] = true;
        }
        for(int i = 0; i<=n; i++){
            if(bool[i]==false) return i;
        }
        return -11111;
    }
}
