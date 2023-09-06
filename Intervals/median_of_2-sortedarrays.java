class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //bruteforce app--> make arraylist , add elements of both in arraylist , sort arraylist nlogn , return mid or mean of mids in case of more than one mids , o(m+n) tc o(m+n) but we need in log(m+n)

        //this approach is working but the performance is very poor

        // List<Integer> mylist = new ArrayList<>();

        // for(int k:nums1){
        //     mylist.add(k);
        // }

        // for(int k:nums2){
        //     mylist.add(k);
        // }

        // Collections.sort(mylist);

        // System.out.println(mylist);

        // int size = mylist.size();

        // if(mylist.size()%2==1){
        //     System.gc();
        //     return (double)mylist.get(mylist.size()/2); 
        // }
        // else{
        //     double a = mylist.get(size/2);
        //     double b = mylist.get((size/2)-1);

        //     // System.out.println(a);
        //     // System.out.println(b);
        //     return (a+b)/2;
        // }

        

        
    }
}