class Solution {
    public int minPartitions(String n) {
        char maxc='0';
        for(char c:n.toCharArray()){
            if(c>maxc){
                maxc=c;
            }
            if(maxc=='9'){
                return 9;
            }
        }
        return maxc-'0';
        
    }
}