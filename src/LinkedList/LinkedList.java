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
}
