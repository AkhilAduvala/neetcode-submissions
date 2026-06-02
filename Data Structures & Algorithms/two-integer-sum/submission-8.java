class Solution {
    public int[] twoSum(int[] nums, int target) {

        // O(n)
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        // O(n)
        for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];

            if(complementMap.containsKey(complement)){
                return new int[]{complementMap.get(complement), i};
            }else{
                complementMap.put(nums[i], i);
            }
        }

        return new int[]{}; // time : O(n), space : O(n)
    }
}
