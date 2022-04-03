package com.ycp;

//Comment added in LinkedList

public class LinkedList {
	
	private Node head;
	
	public LinkedList()
	{
		head=null;
	}

	public void insertAtFront(int ele)
	{
		Node temp=new Node();
		temp.setData(ele);
		if(head==null)            // if list doesn't have node
		{
			head=temp;
		}
		else                      // if list contains already  node/s
		{
			temp.setNext(head);
			head=temp;
		}
	}
	
	public void insertAtEnd(int ele)
	{
		Node temp=new Node();
		temp.setData(ele);
		if(head==null)                  // if list doesn't have node
		{
			head=temp;
		}
		else                             // if list contains already  node/s
		{
			Node curr=head;
			while(curr.getNext()!=null)
			{
				curr=curr.getNext();
			}
			curr.setNext(temp);
		}
	}
	
	public void deleteNode(int ele)
	{
		Node curr=head;
		Node prev=null;
		
		if(head.getData()==ele)
		{
			head=head.getNext();
			curr.setNext(null);
		}
		else
		{
			while((curr!=null) && (curr.getData()!=ele))
			{
				prev=curr;
				curr=curr.getNext();
			}
			if(curr!=null)
			{
				prev.setNext(curr.getNext());
				curr.setNext(null);
			}
			else
			{
				System.out.println("Number is not present");
			}
		}
		
		
	}
	
	public void insertAtPosition(int index,int ele)
	{
		Node temp=new Node();
		temp.setData(ele);
		int count=1;
		if(index==1)                  // if list doesn't have node
		{
			Node curr=head;
			head=temp;
			temp.setNext(curr);
			//count++;
			
		}
		else
		{
			Node curr=head;
			Node prev=null;
			
			while(count!=index)
			{
				prev=curr;
				curr=curr.getNext();
				count++;
				
				
			}
			
			prev.setNext(temp);
			temp.setNext(curr);
			
			
		}
		
		
		
	}
	
	
	
	public void traverse()
	{
		Node curr=head;
		System.out.println("The Elements are ");
		//System.out.println();
		while(curr!=null)
		{
			System.out.println(curr.getData());
			curr=curr.getNext();
		}
	}
}
