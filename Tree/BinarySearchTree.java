import java.util.*;

public class BinarySearchTree {

   static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;

        }

    }

    Node root;

    BinarySearchTree(int data) {
        root = new Node(data);
    }

    BinarySearchTree() {
        root = null;
    }

    public void Inorder(Node root) {

        if (root != null) {
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }

    }

    public void Preorder(Node root) {

        if (root != null) {
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

    }

    public void Postorder(Node root) {

        if (root != null) {

            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }

    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;

        } else if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;

    }

    public boolean Search(Node root, int data) {

        if (root != null) {
            if (root.data == data) {
                return true;
            } else if (root.data < data) {
                return Search(root.right, data);
            } else {
                return Search(root.left, data);
            }

        }
        return false;

    }

    public static void main(String args[]) {
    
    /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
    
    BinarySearchTree tree = new BinarySearchTree(50);
        tree.insert(tree.root,30);
        tree.insert(tree.root,20);
        tree.insert(tree.root,40);
        tree.insert(tree.root,70);
        tree.insert(tree.root,60);
        tree.insert(tree.root,80);
 
        // print inorder traversal of the BST
        tree.Inorder(tree.root);
    }

}
