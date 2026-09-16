class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=0;
        for(int i=0;i<candies.length;i++){
            if(m<candies[i]){
                m=candies[i];
            }
        }
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int n=candies[i]+extraCandies;
            if(n>=m){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}