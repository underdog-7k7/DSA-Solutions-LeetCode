/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 //This is Recursive approach
// class Solution {

//     /*static*/ List<Integer> answer = new ArrayList<>(); //somehow static wasnt being allowed

//    /*static*/ void pretraversal(TreeNode current){
//         if(current==null){
//             return;
//         }

//         answer.add(current.val);
//         pretraversal(current.left);
//         pretraversal(current.right);
//     }

//     public List<Integer> preorderTraversal(TreeNode root) {
//         pretraversal(root);
//         return answer;
//     }
// }

//This is iterative approach--> this is again using stack , which tells us that stack is very closely related to recursion , this is how recursion is implemented internally

// class Solution {    
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> answer = new ArrayList<>();
//         Stack<TreeNode> stack = new Stack<>();
//         stack.add(root);
        
//         // Note that we add currNode's right child to the stack first.
//         while (!stack.isEmpty()) {
//             TreeNode currNode = stack.peek();
//             stack.pop();
//             if (currNode != null) {
//                 answer.add(currNode.val);
//                 stack.add(currNode.right);
//                 stack.add(currNode.left);
//             }
//         }
        
//         return answer;
//     }
// }