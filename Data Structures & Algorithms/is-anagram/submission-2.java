class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            characters.put(s.charAt(i), characters.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            if (!characters.containsKey(t.charAt(j))) {
                return false;
            }
            if (characters.get(t.charAt(j)) == 1) {
                characters.remove(t.charAt(j));
            } else {
                characters.put(t.charAt(j), characters.get(t.charAt(j)) - 1);
            }
        }

        return true;
    }
}
