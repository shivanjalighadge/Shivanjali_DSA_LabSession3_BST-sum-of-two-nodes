package BinaryTree;

public class DriverApp {

	public static void main(String[] args) {
		 Node root = null;
	        Node rootNode = new Node(0);

	        root = rootNode.insert(root, 40);
	        root = rootNode.insert(root, 20);
	        root = rootNode.insert(root, 60);
	        root = rootNode.insert(root, 10);
	        root = rootNode.insert(root, 30);
	        root = rootNode.insert(root, 50);
	        root = rootNode.insert(root, 70);

	        int sum = 130;
	        FindSumPair findSumPair = new FindSumPair();
			findSumPair.findPairWithSum(root, sum);
	    }
	}

