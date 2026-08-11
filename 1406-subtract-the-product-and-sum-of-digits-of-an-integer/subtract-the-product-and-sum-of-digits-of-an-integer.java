class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n>0){
            int f=n%10;
            p=p*f;
            s=s+f;
            n/=10;

        }
        return p-s;


        
    }
}