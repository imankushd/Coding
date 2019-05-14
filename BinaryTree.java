package snippet;
class Node1 
{ 
	int data; 
	Node1 left, right; 

	Node1(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class BinaryTree 
{ 
	Node1 root; 

	// Recursive function to check if two Node1s are 
	// siblings 
	boolean isSibling(Node1 Node1, Node1 a, Node1 b) 
	{ 
		// Base case 
		if (Node1 == null) 
			return false; 

		return ((Node1.left == a && Node1.right == b) || 
				(Node1.left == b && Node1.right == a) || 
				isSibling(Node1.left, a, b) || 
				isSibling(Node1.right, a, b)); 
	} 

	// Recursive function to find level of Node1 'ptr' in 
	// a binary tree 
	int level(Node1 Node1, Node1 ptr, int lev) 
	{ 
		// base cases 
		if (Node1 == null) 
			return 0; 

		if (Node1 == ptr) 
			return lev; 

		// Return level if Node1 is present in left subtree 
		int l = level(Node1.left, ptr, lev + 1); 
		if (l != 0) 
			return l; 

		// Else search in right subtree 
		return level(Node1.right, ptr, lev + 1); 
	} 

	// Returns 1 if a and b are cousins, otherwise 0 
	boolean isCousin(Node1 Node1, Node1 a, Node1 b) 
	{ 
		// 1. The two Node1s should be on the same level 
		//	 in the binary tree. 
		// 2. The two Node1s should not be siblings (means 
		// that they should not have the same parent 
		// Node1). 
		return ((level(Node1, a, 1) == level(Node1, b, 1)) && 
				(!isSibling(Node1, a, b))); 
	} 

	//Driver program to test above functions 
	public static void main(String args[]) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node1(1); 
		tree.root.left = new Node1(2); 
		tree.root.right = new Node1(3); 
		tree.root.left.left = new Node1(4); 
		tree.root.left.right = new Node1(5); 
		tree.root.left.right.right = new Node1(15); 
		tree.root.right.left = new Node1(6); 
		tree.root.right.right = new Node1(7); 
		tree.root.right.left.right = new Node1(8); 

		Node1 Node11, Node12; 
		Node11 = tree.root.left.left; 
		Node12 = tree.root.right.right; 
		if (tree.isCousin(tree.root, Node11, Node12)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 