class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()) return false;
         HashMap<Character,Integer> Smap = new HashMap<>();
         for(int i =0; i<s.length();i++){
            if(Smap.containsKey(s.charAt(i))){
                int freq = Smap.get(s.charAt(i));
                Smap.put(s.charAt(i),freq+1);
            }
           else Smap.put(s.charAt(i),1);
         }
         for(char ch : t.toCharArray()){
            if(!Smap.containsKey(ch)) return false;
            else Smap.put(ch,Smap.get(ch)-1);
            if(Smap.get(ch)<0) return false; 
         }
         return true;

    }
}
