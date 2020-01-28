package snippet;

import snippet.TreeCreation.BSTNode;

public class TreeCreation {
	static BSTNode root;
	static class BSTNode{
		int val;
		BSTNode left,right;
		BSTNode(int d)
		{
			val=d;
			left=right=null;
		}
	}
	TreeCreation(){
		root=null;
	}
	
	void insert(int d)
	{
		root=insertrec(root,d);
	}
	BSTNode insertrec(BSTNode root,int val)
	{
		if(root==null)
		{
			root=new BSTNode(val);
			return root;
		}
		if(val<root.val)
			root.left=insertrec(root.left,val);
		else{
			root.right=insertrec(root.right,val);
		}
		return root;
	}
	void inOrderTraversal(BSTNode root)
	{
		if(root!=null)
		{
		inOrderTraversal(root.left);
		System.out.print(root.val+" ");
		inOrderTraversal(root.right);
		}
	}
	void preOrderTraversal(BSTNode root)
	{
		if(root!=null)
		{
		System.out.print(root.val+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		}
		
	}
	void postOrderTraversal(BSTNode root)
	{
		if(root!=null)
		{
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.val+" ");
		}
		
	}
	//height of a tree
	int height(BSTNode root)
	{
		if(root==null)
			return 0;
		else
		{
			int lheight=height(root.left);
			int rheight=height(root.right);
			
			if(lheight>rheight)
				return (lheight+1);
			else
				return (rheight+1);
		}
	}
	//check if aa tree is a BST or not
	boolean isBST()
	{
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	boolean isBSTUtil(BSTNode node,int min,int max)
	{
		if(node==null)
			return true;
		if(node.val<min || node.val>max)
			return false;
		return (isBSTUtil(node.left,min,node.val-1) && isBSTUtil(node.right, node.val+1, max));
	}
	
	//Minimum height of a tree
	int minHeight(BSTNode root)
	{
		if(root==null)
		return 0;
		if(root.left==null&&root.right==null)
			return 1;
		if(root.left==null)
		return minHeight(root.right);
		if(root.right==null)
		return minHeight(root.left);
		
		return Math.min(minHeight(root.left), minHeight(root.right))+1;
	}
  
public static void main(String args[])
{
	TreeCreation t=new TreeCreation();
	t.insert(3);
	t.insert(1);
	t.insert(2);
	t.insert(4);
	t.insert(6);
	//t.traverseTree(root);
	t.inOrderTraversal(root);
	System.out.println();
	t.preOrderTraversal(root);
	System.out.println();
	t.postOrderTraversal(root);
	int h=t.height(root);
	System.out.println();
	
	System.out.println("Maximum height of given Binary Tree is "+h);
	
	System.out.println("Minimum height of given Binary Tree is "+t.minHeight(root));
	
	if(t.isBST())
		System.out.println("Tree is BST");
	else
		System.out.println("Tree is not BST");
	BSTNode n=t.mirror(root);
	t.inOrderTraversal(n);
}

BSTNode mirror(BSTNode root) {
	// TODO Auto-generated method stub
	       
           if(root==null)
        	   return null;
           BSTNode left=mirror(root.left);
           BSTNode right=mirror(root.right);
           
           root.left=right;
           root.right=left;
		return root;
}
}
