class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;

        // O(n)
        for(int n : nums){
            if(count == 0){
                majority = n;
            }
            count += (n == majority) ? 1 : -1;
        }

        return majority; // time : O(n), space : O(1)
    }
}