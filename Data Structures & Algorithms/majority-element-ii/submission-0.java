class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int x : nums){
            frequency.put(x, frequency.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            if(entry.getValue() > nums.length/3){
                result.add(entry.getKey());
            }
        }

        return result;

    }
}