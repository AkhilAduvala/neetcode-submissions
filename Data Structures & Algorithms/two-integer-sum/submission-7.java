class Solution {
    public int[] twoSum(int[] nums, int target) {

        // O(n)
        HashMap<Integer, Integer> compliments = new HashMap<>();

        // O(n)
        for(int i = 0; i < nums.length; i++){
            if(compliments.containsKey(nums[i])){
                return new int[]{compliments.get(nums[i]), i};
            }else{
                compliments.put(target-nums[i], i);
            }
        }

        return new int[]{}; // time : O(n), space : O(n)
    }
}
