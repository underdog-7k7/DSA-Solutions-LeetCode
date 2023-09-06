class Solution {
    public int search(int[] nums, int target) {
        //finding the element or idx where the rotation has happened will already make the program O(N) in the worst case but the need is O(log n),if you're gonna have O(n) might as well do a linear search


        //LINEAR SEARCH-->Getting accepted but its not our purpose
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;

        

        //the key here is to understand what half(left or right) is in sorted order , once we identify that , we can do binary search there, and so on

        //BINARY SEARCH APPROACH
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            else{
                return -1;
            }
        }
        int ptr1 = 0;
        int ptr2 = nums.length-1;

        while(ptr1<=ptr2){
            int mid = ptr1 + (ptr2-ptr1)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[ptr1]){
                if(target<nums[mid] && target >=nums[ptr1]){
                    ptr2 = mid-1;
                }
                else{
                    ptr1 = mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[ptr2]){
                    ptr1 = mid+1;
                }
                else{
                    ptr2 = mid-1;
                }
            }
        }
        System.gc();
        return -1;

    }
}