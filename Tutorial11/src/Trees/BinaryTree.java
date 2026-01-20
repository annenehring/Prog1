package Trees;

public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder:   " + tree.inOrder(tree.root));

    }

    private String inOrder(Node current) {
        String res = "";

        if (current.left != null) {
            res += inOrder(current.left) + ",";
        }

        res += current.value; //1 - 3 - 4 - 6 -

        if (current.right != null) {
            res += "," + inOrder(current.right);
        }

        return res;
    }
}
