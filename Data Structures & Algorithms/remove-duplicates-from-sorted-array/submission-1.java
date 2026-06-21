class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        if(nums.length == 0){
            return k;
        }else{
            nums[k] = nums[0];
            k++;
        }
        
        for(int i = 1; i < nums.length; i++){
            if(nums[k-1] != nums[i]){
                nums[k++] = nums[i];          
            }
        }
        return k;
    }
}