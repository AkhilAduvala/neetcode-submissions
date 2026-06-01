class Solution {
    public int[] getConcatenation(int[] nums) {
        int inputLength = nums.length;

        int[] ans = new int[inputLength * 2];

        // O(n)
        for(int i = 0; i < inputLength; i++){
            ans[i] = nums[i];
            ans[i + inputLength] = nums[i];
        }
        return ans; //space : O(n), time : O(n)
    }
}