package BinaryTree;

import java.util.HashSet;
import java.util.Set;

public class FindSumPair {
	 public void findPairWithSum(Node root, int sum) {
	        Set<Integer> set = new HashSet<>();
	        if (!findPairUtil(root, sum, set)) {
	            System.out.println("Pair not found");
	        }
	    }

	    public static boolean findPairUtil(Node root, int sum, Set<Integer> set) {
	        if (root == null) {
	            return false;
	        }

	        if (findPairUtil(root.left, sum, set)) {
	            return true;
	        } 
	        else {
	            if (set.contains(sum - root.value)) {
	                System.out.println("Pair found: " + root.value + " and " + (sum - root.value));
	                return true;
	            }
	            set.add(root.value);
	        }

	        return findPairUtil(root.right, sum, set);
	    }
	}

