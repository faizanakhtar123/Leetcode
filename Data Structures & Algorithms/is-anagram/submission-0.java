class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()) return false;
         HashMap<Character,Integer> Smap = new HashMap<>();
         HashMap<Character,Integer> Tmap = new HashMap<>();
         for(int i =0; i<s.length();i++){
            if(Smap.containsKey(s.charAt(i))){
                int freq = Smap.get(s.charAt(i));
                Smap.put(s.charAt(i),freq+1);
            }
           else Smap.put(s.charAt(i),1);
         }
         for(int i = 0; i<t.length(); i++){
             if(Tmap.containsKey(t.charAt(i))){
                int freq = Tmap.get(t.charAt(i));
                Tmap.put(t.charAt(i),freq+1);
             }
            else Tmap.put(t.charAt(i),1);
         }
         for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Smap.get(ch).equals(Tmap.get(ch)))
            return false;
         }
         return true;

    }
}
