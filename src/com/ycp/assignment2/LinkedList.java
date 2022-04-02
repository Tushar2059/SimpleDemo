package com.ycp.assignment2;

import com.ycp.Node;

public class LinkedList {
	
	Node head;
	
	public LinkedList()
	{
		head=null;
	}
	
	public void insert(int ele)
	{
		Node temp=new Node();
		temp.setData(ele);
		Node curr=head;
		if(head==null)
		{
			head=temp;
		}
		else
		{ /*
			while(curr!=null)
			{
		         if(ele>curr.getData());
		         {
		            int temp1;
		            temp1=ele;
		            ele=head.getData();
		            
		         }
		         curr=curr.getNext();
			}     */
			temp.setNext(head);
			head=temp;
		}
	}
	
	
	
		public void traverse()
		{
			Node curr=head;
			System.out.println("The Elements are ");
			while(curr!=null)
			{
				System.out.println(curr.getData());
				curr=curr.getNext();
			}
		}
	

}
