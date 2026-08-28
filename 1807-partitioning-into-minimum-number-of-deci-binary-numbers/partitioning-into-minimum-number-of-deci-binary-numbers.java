class Solution {
    public int minPartitions(String n) {
        int maxdigit=0;
        for(int i=0;i<n.length();i++){
            int cur=n.charAt(i)-'0';
            if(maxdigit<cur){
                maxdigit=cur;
            }
        }
        return maxdigit;
        
    }
}