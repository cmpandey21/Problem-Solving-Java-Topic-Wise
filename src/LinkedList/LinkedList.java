package LinkedList;

public class LinkedList {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	void display() {
		
		System.out.println("-----------------------------");
		Node temp = this.head;
		while (temp != null) {

			System.out.print(temp.data + ", ");
			temp=temp.next;
		}
		System.out.println(".");
		System.out.println("-----------------------------");
	}
	
	public void addLast(int item)
	{
		//create new node
		Node nn=new Node();
		nn.data=item;
		nn.next=null;
		
		//attach
		if(this.size >= 1)
		{
			this.tail.next=nn;
		}
		//summary
		if(this.size ==0)
		{
		this.head=nn;
		this.tail=nn;
		this.size++;
		}
		else
		{
			this.tail=nn;
			this.size++;
		}
	}
	
	public void addFirst(int item)
	{
		//create node
		
		Node nn=new Node();
		nn.data=item;
		nn.next=null;
		
		//attach
		
		if(this.size >= 1)
		{
			nn.next=head;
		}
		
		//summary object update
		
		if(this.size ==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		
		else
		{
			this.head=nn;
			size++;
		}
	}
	
	public int getFirst() throws Exception
	{
		if(this.size ==0)
		{
			throw new Exception("Linked list is empty");
		}
		
		return this.head.data;
	}

	public int getLast() throws Exception
	{
		if(this.size ==0)
		{
			throw new Exception("Linked list is empty");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int idx) throws Exception
	{
		if(this.size ==0)
		{
			throw new Exception("Linked list is empty");
		}
		
		if(idx<0 || idx>=this.size)
		{
			throw new Exception("Invalid index");
		}
		
		Node temp=this.head;
		for(int i=1;i<=idx;i++)
		{
			temp=temp.next;
		}
		
		return temp.data;
	}
	
	private Node getNodeAt(int idx) throws Exception
	{
		if(this.size ==0)
		{
			throw new Exception("Linked list is empty");
		}
		
		if(idx<0 || idx>=this.size)
		{
			throw new Exception("Invalid index");
		}
		
		Node temp=this.head;
		for(int i=1;i<=idx;i++)
		{
			temp=temp.next;
		}
		
		return temp;
	}

	public void addAt(int item, int idx) throws Exception
	{
		
		if(idx<0 || idx>size)
			
		{
			throw new Exception("Invalid index");
		}
		
		if(idx==0)
		{
			addFirst(item);
		}
		else if(idx>=this.size)
		{
			addLast(item);
		}
		else
		{
			//create a new node
			Node nn=new Node();
			nn.data=item;
			nn.next=null;
			
			//attach
			Node nm1=getNodeAt(idx-1);
			Node np1=nm1.next;
			
			nm1.next=nn;
			nn.next=np1;
			
			//summary update
			this.size++;
		}
	}
	
	public int removeFirst() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Empty list");
		}
			
		int rv=this.head.data;
		if(this.size==1)
		{
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		else
		{
			this.head=this.head.next;
			this.size--;
		}
		return rv;
	}

	public int removeLast() throws Exception {
		if(this.size==0)
		{
			throw new Exception("Empty List");
		}
		
		int rv=this.tail.data;
		if(this.size==1)
		{
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		else
		{
			Node sizem2=getNodeAt(this.size-2);
			this.tail=sizem2;
			this.tail.next=null;
			this.size--;
		}
		
		return rv;
	}

	public int removeAt(int idx) throws Exception {
		if(this.size==0)
		{
			throw new Exception("LL is Empty");
		}
		
		if(idx<0 || idx>=this.size)
		{
			throw new Exception("Invalid Index");
		}
		
		if(idx==0)
		{
			return removeFirst();
			
		}
		else if(idx==this.size-1)
		{
			return removeLast();
		}
		else
		{
			Node nm1=getNodeAt(idx-1);
			Node n=nm1.next;
			Node np1=n.next;
			
			nm1.next=np1;
			this.size--;
			
			return n.data;
		}
	}
}

