class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> hash = new HashSet<>();
      for(int ele : nums){
         if(hash.contains(ele))
          return true;
           hash.add(ele);
      }  
      return false;
    }
}