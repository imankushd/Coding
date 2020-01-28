package snippet;
import java.util.*;
public class LinkedListcreation {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
		 this.data=d;
		 next=null;
		}
	}
	LinkedListcreation()
	{
		head=null;
	}
	public Node insert(int d)
	{
		Node n=new Node(d);
		n.next=head;
		head=n;
		return head;
	}
	public Node insertAfter(int d)
	{
		Node n=new Node(d);
		Node end=head;
		
		return head;
	}
	
	public int isPalin(Node current)
	{ 
		Node temp=current;//passed linked list
		Node c=current;
		while(temp!=null&&c!=null)
		{
			c.data=temp.data;
			c.next=temp.next;
			temp=temp.next;
		}
		
		Node prev=null,next=null;
		//reversing the linked list
		while(c!=null)
		{
			next=c.next;
			c.next=prev;
			prev=c;
			c=next;
		}
		c=prev;//reversed linked list
			while(c!=null)
			{
				System.out.print(c.data+" ");
				c=c.next;
			}
		while(c!=null && temp!=null)
		{
			if(c.data==temp.data)
			{
				c=c.next;
				temp=temp.next;
			}
			else
				return 0;
			
		}
		if(c==null&&temp==null)
			return 1;
	return 0;
		
	}
public static void main(String args[])
{
	LinkedListcreation l=new LinkedListcreation();
	l.insertAfter(1);
	l.insertAfter(2);
	l.insertAfter(1);
	//l.insert(6);
	//Node current=head;
	//while(head)
	int c=l.isPalin(head);
	System.out.println("Ans: "+c);
}
}
