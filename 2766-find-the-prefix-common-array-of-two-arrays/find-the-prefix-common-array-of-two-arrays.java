class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int a=A.length;
        int[] c = new int[a];
        int[] res = new int[a+1];
        int common=0;
        for(int i=0;i<a;i++){
            res[A[i]]++;
            if(res[A[i]]==2){
                common++;
            }
            res[B[i]]++;
            if(res[B[i]]==2){
                common++;
            }
            c[i]=common;
            
        }
        return c;
    }
}