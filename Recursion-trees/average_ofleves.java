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
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        //iterative soln:
        List<Double> mylist = new ArrayList<>();
        if(root==null){
            mylist.add((1.0)-(1.0));
            return mylist;
        }
        

        Queue<TreeNode> Q = new LinkedList<>();

        Q.add(root);

        while(!Q.isEmpty()){
            int size = Q.size(); // initialized with size 1
            List<TreeNode> currentlevel = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode currentnode = Q.poll();
                currentlevel.add(currentnode);

                if(currentnode.left!=null){
                    Q.offer(currentnode.left);
                }

                if(currentnode.right!=null){
                    Q.offer(currentnode.right);
                }
            }
            
            long leveltotal=0;

            for(TreeNode m: currentlevel){
                leveltotal+= m.val;
            }

            Double nr = (double)leveltotal;
            Double dr = (double)currentlevel.size();
            mylist.add(nr/dr);
        }

        return mylist;
    }
}