class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length(),n=needle.length();
        int k=0;
        if(m<n){k=-1;}
        else{
        for(int i=0;i<=m-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                k=i;
                break;
            }
            else{
                k=-1;
            }
        }
        }
        return k;
    }
}
