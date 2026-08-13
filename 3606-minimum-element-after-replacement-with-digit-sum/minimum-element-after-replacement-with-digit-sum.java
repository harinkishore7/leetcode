class Solution {
    public int minElement(int[] nums) {
        int l=nums.length;
        int[] res=new int[l];
        for(int i=0;i<l;i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                int t=n%10;
                sum+=t;
                n/=10;
            }
            res[i]=sum;
        }
        int min=res[0];
        for(int i=0;i<l;i++){
            if(min>res[i]){
                min=res[i];
            }

        }
        return min;
        
    }
}