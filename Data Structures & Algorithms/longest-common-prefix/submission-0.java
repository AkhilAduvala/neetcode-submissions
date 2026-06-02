class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); //O(nlogn)

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        StringBuilder result = new StringBuilder();

        while(i < first.length() && i < last.length()){
            if(first.charAt(i) != last.charAt(i)){
                return result.toString();
            }
            result.append(first.charAt(i));
            i++;
        }

        return result.toString();

    }
}