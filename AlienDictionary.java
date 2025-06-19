class Solution {
    public String findOrder(String[] words) {
        Map<Character,Set<Character>> g=new HashMap<>();
        int[] in=new int[26];
        Arrays.fill(in,-1);
        for(String w:words)
            for(char c:w.toCharArray())
                if(in[c-'a']==-1){
                    in[c-'a']=0;
                    g.put(c,new HashSet<>());
                }
        for(int i=0;i<words.length-1;i++){
            String w1=words[i],w2=words[i+1];
            if(w1.length()>w2.length()&&w1.startsWith(w2))return "";
            for(int j=0;j<Math.min(w1.length(),w2.length());j++){
                char c1=w1.charAt(j),c2=w2.charAt(j);
                if(c1!=c2){
                    if(!g.get(c1).contains(c2)){
                        g.get(c1).add(c2);
                        in[c2-'a']++;
                    }
                    break;
                }
            }
        }
        Queue<Character> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(char c:g.keySet())
            if(in[c-'a']==0)q.offer(c);
        while(!q.isEmpty()){
            char cur=q.poll();
            sb.append(cur);
            for(char nei:g.get(cur)){
                in[nei-'a']--;
                if(in[nei-'a']==0)q.offer(nei);
            }
        }
        return sb.length()==g.size()?sb.toString():"";
    }
}
