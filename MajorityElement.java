class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int maj=-1;
        for(int i=0;i<nums.length;i++){
             if(count==0){
                maj=nums[i];
             }   
             count+=(nums[i]==maj)?1 :-1;
        }
        return maj;
}
}
