class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];

            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            String countKey = Arrays.toString(count);

            groups.putIfAbsent(countKey, new ArrayList<>());

            groups.get(countKey).add(s);
        }

        return new ArrayList<> (groups.values());
    }
}
