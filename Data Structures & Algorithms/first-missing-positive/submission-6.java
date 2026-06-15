class Solution {
    public int firstMissingPositive(int[] nums) {

        int min = 1;

        while (min <= nums.length + 1) {

            boolean found = false;

            for (int x : nums) {
                if (x == min) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return min;
            }

            min++;
        }

        return min;
    }
}