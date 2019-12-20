package dataStructures;

import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class HeightOfBST{

	static Node root=null;
	
	public static int getHeight(Node root){
      //Write your code here
        if(root==null)
        {
                return 0;
        }
        else
        {
                int lh=getHeight(root.left);
                int rh=getHeight(root.right);
                
                System.out.println("root: "+root.data);
                System.out.println("height(l,h): "+lh+" , "+rh);

                
                if(lh>rh)
                    return lh+1;
                else
                    return rh+1;
        }
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            
            while(T-->0){
                int data=sc.nextInt();
                insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}