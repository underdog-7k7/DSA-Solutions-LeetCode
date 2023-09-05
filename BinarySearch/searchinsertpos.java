class Solution {
    public int searchInsert(int[] nums, int target) {

        //LINEAR SEARCH--TC ON -- SC O1
        // int dumbo=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         dumbo=i;
        //     }
        //     else if(nums[i]<target){
        //         dumbo=i+1;
        //     }
        //     else{
        //         continue;
        //     }
        // }
        // return dumbo;


        //BINARY SEARCH APPROACH 

        //TC OlogN SC O1

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int pivot = left+(right-left)/2;
            if(nums[pivot]==target){
                return pivot;
            }
            else if(nums[pivot]<target){
                left= pivot+1;
            }
            else{
                right = pivot-1;
            }
        }

        System.gc();
        return left;
    }
}