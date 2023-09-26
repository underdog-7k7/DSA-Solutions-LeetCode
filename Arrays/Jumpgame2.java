class Solution {

    //working but TLE
    // int ms=Integer.MAX_VALUE;
    // public void checkjump(int cp , int arr[], int steps){
    //     if(!(cp<arr.length)){
    //         return;
    //     }

    //     if(cp+arr[cp]>=arr.length-1){
    //         if(steps<ms){
    //             ms=steps;
    //             return;
    //         }
    //     }
    //     else{
    //         for(int i=1;i<=arr[cp];i++){
    //             checkjump(cp+i,arr,steps+1);
    //         }
    //     }


    // }
    // public int jump(int[] nums) {
    //     if(nums.length==1){
    //         return 0;
    //     }
    //     checkjump(0,nums,1);
    //     return ms;
    // }

    public int jump(int[] nums) {
        int step_count = 0;
int last_jump_max = 0;
int current_jump_max = 0;
for(int i=0; i<nums.length-1; i++) {
    current_jump_max = Math.max(current_jump_max, i+nums[i]);
    if( i == last_jump_max ) {
        step_count++;
        last_jump_max = current_jump_max;
    } 
}
System.gc();
return step_count;
    }

    
}