class Solution {
    public int[] findArray(int[] pref) {
        int l=pref.length;
        int[] arr=new int[l];
        arr[0]=pref[0];
        for(int i=1;i<l;i++){
            arr[i]=pref[i]^pref[i-1];
        }
        return arr;
    }
}