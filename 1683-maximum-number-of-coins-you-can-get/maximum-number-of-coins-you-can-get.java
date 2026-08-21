class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l=piles.length;
        int ans=0;
        for(int i=l-2;i>=l/3;i-=2){
            ans+=piles[i];
        }
        return ans;
        
    }
}