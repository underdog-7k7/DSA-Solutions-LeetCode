/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> mylist = new ArrayList<>();

        ListNode current = head;

        while(current!=null){
            mylist.add(current.val);
            current = current.next;
        }

        int linksize = mylist.size();

        int arr[] = new int[linksize];

        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
        int count = 0;
        for(Integer m:mylist){
            arr[(count+k)%linksize] =m;
            count++;
        }

        ListNode newcurr = head;
        int nig= 0;
        while(newcurr!=null){
            newcurr.val = arr[nig];
            nig++;
            
           newcurr= newcurr.next;
        }
        return head;

    }
}