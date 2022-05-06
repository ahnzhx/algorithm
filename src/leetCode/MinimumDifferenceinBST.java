package leetCode;


public class MinimumDifferenceinBST {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
    }

    // todo 여기 디버깅 해보기
    static int min = Integer.MAX_VALUE;
    static boolean init;
    static int prev;
    public static int getMinimumDifference(TreeNode root) {
        init = false;
        inorder(root);
        return min;

    }
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(!init){
            init = true;
        }else{
            min = Math.min(min, root.val-prev);
        }
        prev = root.val;
        inorder(root.right);

    }

    public static void main(String[] args) {

//        TreeNode node6 = new TreeNode(6);
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node2 = new TreeNode(2, node1, node3);
//        TreeNode node4 = new TreeNode(4, node2, node6);





        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5, node3, null);
        TreeNode node1 = new TreeNode(1, null, node5);

        System.out.println(getMinimumDifference(node1));
    }
}
