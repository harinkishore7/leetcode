class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int op=0;op<k;op++){
            int minindex=0;
            for(int i=0;i<nums.length;i++){
                if(nums[minindex]>nums[i]){
                    minindex=i;
                }
            }
            nums[minindex] *= multiplier;
        }
        return nums;
        
    }
}