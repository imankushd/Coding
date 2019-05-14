package snippet;

import java.util.*;

public class ExpreseeionTree {
 class Node{
	 char c;
	 Node left,right;
	public Node(char c) {
		this.c = c;
		left=null;
		right=null;
	}
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpreseeionTree e= new ExpreseeionTree();
        String postfix="ab+ef*g*-";
        char[] ch=postfix.toCharArray();
        Node root=e.constructTree(ch);
        inOrder(root);
	}
	static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if(root!=null){
			inOrder(root.left);
			System.out.println(root.c);
			inOrder(root.right);
		}
			
	}
	public Node constructTree(char[] ch) {
		// TODO Auto-generated method stub
		Stack<Node> st=new Stack();
		Node t,t1,t2;
		for(int i=0;i<ch.length;i++)
		{
			if(!isOperand(ch[i]))
			{
				t=new Node(ch[i]);
				System.out.println(ch[i]);
				st.push(t);
			}
			else{
				t=new Node(ch[i]);
				
				t1=st.pop();
				t2=st.pop();
				
				t.right=t1;
				t.left=t2;
				System.out.println(t1+" "+t2);
				st.push(t);
			}
		}
		t=st.peek();
		st.pop();
			
		return t;
	}
	static boolean isOperand(char c) {
		// TODO Auto-generated method stub
		if(c=='+'||c=='-'||c=='/'||c=='*'||c=='^')
			return true;
		return false;
	}

}
//ab+ef*g*-