class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;

        for(int n : nums){
            if(majority == n){
                count++;
            } else {
                count--;
                if(count < 0){
                    majority = n;
                }
            }
        }

        return majority;
    }
}