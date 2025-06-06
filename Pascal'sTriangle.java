class Solution {
    public List<List<Integer>> generate(int numRows) {
        int nums=1;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List row=new ArrayList<>();
            for(int k=0;k<=i;k++){
                row.add(nums);
                nums=nums*(i-k)/(k+1);
            }
            list.add(row);
            nums=1;
        }
        return list;
        
    }
}
