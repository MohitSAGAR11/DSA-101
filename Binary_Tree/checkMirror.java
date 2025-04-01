package Binary_Tree;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}
public class checkMirror {
    public static void main(String[] args) {
        
    }

    public boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
}
