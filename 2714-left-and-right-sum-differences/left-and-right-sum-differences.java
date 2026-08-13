class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int left=0;
        int l=nums.length;
        int[] res=new int[l];
        for(int i=0;i<l;i++){
            int right=total-left-nums[i];
            res[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return res;        
    }
}