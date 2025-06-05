class Solution {
    public void moveZeroes(int[] nums) {
        int count=0,pos=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    count++;
                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[pos++]=nums[i];
                }
            }
        for(int i=nums.length-1;i>=0;i--){
            if(count!=0){
                nums[i]=0;
                count--;
            }
            else{
                break;
            }
        }
        }
        
    }
