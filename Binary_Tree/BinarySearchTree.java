package Binary_Tree;

public class BinarySearchTree {
    public class TreeNode {
        int val;
        int height;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
            this.height = 1;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.height = 1;
        }
        
        public int getValue() {
            return val;
        }
    }

    private TreeNode root;

    public BinarySearchTree() {

    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        insert(val , root);
    }

    private TreeNode insert(int val , TreeNode node) {
        if (node == null) {
            node = new TreeNode(val);
            return node;
        }

        if(node.val > val) {
            node.left = insert(val , node.left);
        } else if(node.val < val) {
            node.right = insert(val , node.right);
        }

        node.height = 1 + Math.max(height(node.left) , height(node.right));

        return node;
    }


    public boolean isbalanced() {
        return isbalanced(root);
    }

    private boolean isbalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }
        return isbalanced(root.left) && isbalanced(root.right);
    }

    public void display() {
        display(root , "Root node :");
    }

    private void display(TreeNode root , String msg) {
        if (root == null) {
            System.out.println(msg + " null");
            return;
        }
        System.out.println(msg + root.val);
        display(root.left , "Left child of " + root.val + " :");
        display(root.right , "Right child of " + root.val + " :");
    }
}
