package snippet;

import snippet.TreeCreation.BSTNode;

public class MinHeight {
	MinHeight(TreeCreation t)
	{
		t=new TreeCreation();
	}
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
		
		return Math.min(minHeight(root.left), minHeight(root.right));
	}
public static void main(String args[])
{
	TreeCreation t=new TreeCreation();
	t.insert(3);
	t.insert(1);
	t.insert(2);
	t.insert(4);
	t.insert(6);
	MinHeight m=new MinHeight(t);
	TreeCreation.BSTNode root;
	m.minHeight(root);
}
}
