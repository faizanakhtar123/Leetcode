class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> hash = new HashSet<>();
      for(int ele : nums){
         if(hash.contains(ele))
          return true;
          else hash.add(ele);
      }  
      return false;
    }
}