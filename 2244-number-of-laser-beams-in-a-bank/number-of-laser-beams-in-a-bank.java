class Solution {
    public int numberOfBeams(String[] bank) {
        int tot=0;
        int prev=0;
        for(String row:bank){
            int cur=0;
            for(int i=0;i<row.length();i++){
                if(row.charAt(i)=='1'){
                    cur++;
                }
            }
            if(cur>0){
                tot+=prev*cur;
                prev=cur;
            }
        }
        return tot;
        
    }
}