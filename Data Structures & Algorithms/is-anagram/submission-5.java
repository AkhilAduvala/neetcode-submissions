class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // Constraints : s and t consist of lowercase English letters.
        // O(26)
        int[] counts = new int[26];

        //O(n)
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        //O(26)
        for(int value : counts){
            if(value != 0){
                return false;
            }
        }

        return true; // space : O(26), time : O(n)
    }
}
