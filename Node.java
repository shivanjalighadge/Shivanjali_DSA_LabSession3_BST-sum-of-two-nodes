package BinaryTree;

public class Node {
	 public int value;
	    public Node left;
	    public Node right;

	    public Node(int value) {
	        this.value = value;
	        this.left = null;
	        this.right = null;
	    }
	    
	    public Node insert(Node root, int value) {
	        if (root == null) {
	            return new Node(value);
	        }

	        if (value < root.value) {
	            root.left = insert(root.left, value);
	        } else if (value > root.value) {
	            root.right = insert(root.right, value);
	        }

	        return root;
	    }
	}

