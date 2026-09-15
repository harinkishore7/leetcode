class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int l=nums.length;
        
        for(int t=0;t<k;t++){
            int m=nums[0];
            int p=0;
            for(int i=0;i<l;i++){
                if(m>nums[i]){
                    m=nums[i];
                    p=i;
                }
            }
            nums[p]=nums[p]*multiplier;
        }
        return nums;
    }
}