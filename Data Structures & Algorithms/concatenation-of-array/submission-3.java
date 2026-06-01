class Solution {
    public int[] getConcatenation(int[] nums) {
        int inputLength = nums.length;

        int[] ans = new int[inputLength * 2];

        // O(2n)
        for(int i = 0; i < ans.length; i++){
            ans[i] = nums[i%inputLength];
        }
        return ans; //space : O(1), time : O(n)
    }
}