package snippet;

import java.util.*;
class Node{
	int data;
	Node next;
}
public class Snippet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    	Node head=new Node();
 
		while(n!=0)
		{
			head.data=sc.nextInt();
			head.next=null;
			System.out.println(head.data);
			n--;
		}
		//while(head!=null)
		//System.out.println(head.data);
	}
}

