class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,s=0;
        for(int i=1;i<=nums.length;i++){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        return sum-s;
        
    }
}
