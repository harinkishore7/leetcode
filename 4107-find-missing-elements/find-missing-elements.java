class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[l-1];
        List<Integer> res=new ArrayList<>();
        int count=0;
        int j=0;
        for(int i=min;i<max;i++){
            if(i!=nums[j]){
                res.add(i);
            }
            while(j<l && nums[j]==i){
                j++;
            }

        }
        return res;
        
    }
}