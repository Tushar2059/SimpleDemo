package com.ycp;

import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {


		LinkedList l=new LinkedList();
		int count=0;
		l.insertAtFront(12);
		count++;
		l.insertAtFront(20);
		l.insertAtFront(7);
		l.insertAtFront(25);
		l.insertAtEnd(14);
		l.insertAtEnd(9);
		l.insertAtEnd(17);
		l.insertAtEnd(23);
		l.traverse();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be deleted ");
		int element=sc.nextInt();
		l.deleteNode(element);
		//l.traverse();
		
		//l.insertAtPosition(1,30);
		
		l.traverse();

	}

}
