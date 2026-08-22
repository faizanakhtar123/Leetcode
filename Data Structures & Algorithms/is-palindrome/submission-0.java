class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i = 0 , j = s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetter(s.charAt(i))) i++;
            while(i<j && !Character.isLetter(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
            return false;
            else i++; j--;
        }
        return true;
    }
}
