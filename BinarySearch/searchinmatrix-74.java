class Solution {
    public int findPeakElement(int[] nums) {

        //LINEAR APPROACH--3 element window approach , with each iteration shift the window one unit right, cover 0th and last index which are special with specific cases

        // TC ON SC O1--
        //
        // if(nums.length==1){
        //     return 0;
        // }

        // int ptr1 = 0;

        // while(ptr1<nums.length){
        //     int ptrl = ptr1-1;
        //     int ptrr = ptr1+1;

        //     if(ptr1==0){
        //         if(nums[ptr1]>nums[ptrr]){
        //             return ptr1;
        //         }
        //         else{
        //             ptr1++;
        //         }
        //     }
        //     else if(ptr1 == nums.length-1){
        //         return ptr1; //last element will always be the peak
        //     }
        //     else{
        //         if(nums[ptr1]>nums[ptrl] && nums[ptr1]>nums[ptrr]){
        //             return ptr1;
        //         }
        //         else{
        //             ptr1++;
        //         }
        //     }
        // }
        // return -11; //wont ever execute , return will happen from the above ifelse ladder itself



        //BINARY SEARCH APPROACH --since this array is unsorted how to know which way to go if mid is not the answer?

        // eg suppose mid ele = 5 , left of mid is 3 and right of mid is 21 , now we know that mid is definitely not the peak , but now where to go left or right? for that we look at the immediate neighbours which are 3 and 21 , now we know definitely that 3 can also not be a peak , because it has 10 (the current element at its right) but the element 21 has a potential of being the peak since it has one of its neighbours (which is 10) less than itslef (21>10) so we head towards right in the binary search approach

        // int left = 0;
        // int right = nums.length-1;

        // if(nums.length==1){
        //     return 0;
        // }

        // while(left<=right){
        //     int mid = left + (right-left)/2; //to avoid integer overflow

        //     if(mid!=0 && mid!=nums.length-1){ //mid has 2 neigbours
        //         if(nums[mid]>nums[left] && nums[mid]>nums[right]){
        //             return mid; //the mid element happens to be the peak
        //         }
        //         else if(nums[mid-1]>nums[mid]){
        //             right = mid-1;
        //         }
        //         else if(nums[mid+1]>nums[mid]){
        //             left = mid+1;
        //         }
        //     }
        //     else if(mid==0){
        //         if(nums[mid]>nums[mid+1]){
        //             return mid;
        //         }
        //     }
        //     else{
        //         if(nums[mid]>nums[mid-1]){
        //             return mid;
        //         }
        //     }
        // }

        // return -32;

    }
}