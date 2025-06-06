class Solution {
    public String reverseWords(String s) {
        String[] w=s.trim().split("\\s+");
        String ss="";
        for(int i=w.length-1;i>0;i--){
            ss=ss+w[i];
            ss=ss+" ";
            }
           ss=ss+w[0];
        return ss;
    }
}
