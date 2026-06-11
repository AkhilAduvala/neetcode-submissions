class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxSequence = 0;
        for(int n : nums){
            int sequence = 1;
            while(values.contains(++n)){
                sequence++;
            }
            maxSequence = Math.max(maxSequence, sequence);
        }
        return maxSequence;
    }
}
