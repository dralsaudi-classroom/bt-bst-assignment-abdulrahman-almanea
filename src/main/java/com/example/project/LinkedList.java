package com.example.project;

public class LinkedList<T> implements List<T>{
	private Node<T> head;
	private Node<T> current;
	
    public LinkedList() {
		head = current = null;
	}
	public boolean empty() {
		return head == null;
	}
	public boolean last() {
		return current.next == null;
	}
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T e) {
        current.data = e;
    }
    public void insert(T e) {
        if (empty()) {
            current = head = new Node<T>(e);
        } else {
            Node<T> tmp = current.next;
            current.next = new Node<T>(e);
            current = current.next;
            current.next = tmp;
        }
    }
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;
            while (tmp.next != current) {
                tmp = tmp.next;
            }
            tmp.next = current.next;
        }
        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }
    public T mostFrequentElement() {
        if (head == null)
		return null;
	    
    	  current = head;
    	  Node<T>  mostFrequent = head;
    	  int count , maxCount = 1;
    	  
    	   while (current != null) {
    		   count=1;
    		   Node<T> counter = current.next;
    		   while (counter != null) {
    	            if (counter.data.equals(current.data)) {
    	                count++;
    	            }
    	            counter = counter.next;
    		   }
    		   
    		   if (count > maxCount){
    	            maxCount = count;
    	            mostFrequent = current; 
    	            }
    	        current = current.next;
    	   }
	    current = head;
    	   return mostFrequent.data;
    }
}
