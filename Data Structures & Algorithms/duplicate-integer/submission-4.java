class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        // O(n)
        for(int i = 0; i < nums.length; i++){
            if (values.contains(nums[i])){
                return true;
            }else{
                values.add(nums[i]);
            }
        }
        return false; // sapce : O(n), time : O(n)
    }
}