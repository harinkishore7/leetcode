class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int l=nums.length-2;
        int[] count = new int[l];
        int[] res=new int[2];
        int index=0;
        for(int num:nums){
            count[num]++;
            if(count[num]==2){
                res[index]=num;
                index++;
            }
        }
        return res;
    }
}