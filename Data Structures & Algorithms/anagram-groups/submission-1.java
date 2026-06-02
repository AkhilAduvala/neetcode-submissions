class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        //O(n)
        for (String s : strs) {
            char[] chars = s.toCharArray();

            Arrays.sort(chars); // O(mlogm)

            String key = new String(chars);

            groups.putIfAbsent(key, new ArrayList<>());

            groups.get(key).add(s);
        }

        return new ArrayList<>(groups.values()); // time : O(n * mlogm), space : O(n * m)
    }
}
