
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class LinkedListCycle {

	public static Node head=null;
	
	public void insert(int i)
	{
		Node newNode = new Node(i);
		
		newNode.next=head;
		
		head=newNode;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		LinkedListCycle lc=new LinkedListCycle();
		lc.insert(1);
		lc.insert(2);
		lc.insert(3);
		lc.insert(4);
		lc.insert(5);
		
		//Loop creation
        head.next.next.next.next.next=head.next;
		
		Node temp = head;
        
		//Iterating through the Linked List
		
		/*
		 * while(temp!=null) { System.out.print(temp.data +" -> "); temp=temp.next; }
		 * System.out.println("NULL");
		 */
		 		
        
        Node slow=head;
        Node fast=head.next;
        
        while(temp!=null)
        {
        	slow=slow.next;
        	fast=fast.next.next;
        	if(slow==fast)
        	{
        		System.out.println("loop found.");
        		System.out.println("Calling remove loop method. . .");
        		System.out.println("Slow: "+slow+" : "+"Fast: "+fast);
        		removeLoop(slow,fast);
        		break;
        	}
        	temp=temp.next;
        	if(temp==null)
        		break;
        }
        
        Node temp1 = head;
    	while(temp1!=null) 
    	{ 
    		System.out.print(temp1.data +" -> "); 
    		temp1=temp1.next; 
    	}
    	System.out.println("NULL");
	}

	public static void removeLoop(Node slow, Node fast) {
		// TODO Auto-generated method stub
		
		Node p=slow;
		Node p1=fast;
		int c=1;
		
		p=p.next;
		
		while(p!=p1)
		{
			p=p.next;
			c++;
		}
		System.out.println("C: "+c);
		
		p=head;
		p1=head;
		
		for(int i=0;i<c;i++)
			p=p.next;
		
		while(p.next==p1)
		{
			p=p.next;
			p1=p1.next;
		}
		p.next=null;
	}
}
