package com.manparvesh.javarithms.java.datastructures.queue;

public class QueueUsingArray {

	private int capacity;
	int queueArr[];
	int front = 0;
	int rear = -1;
	int currentSize = 0;

	public QueueUsingArray(int queueSize) {
		this.capacity = queueSize;
		queueArr = new int[this.capacity];
	}

	
	 /* Method adds element at the end of the queue*/

	public void enqueue(int item) {
		if (isQueueFull()) {
			System.out.println("Overflow ! Unable to add element: " + item);
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = item;
			currentSize++;
			System.out.println("Element " + item + " is pushed to Queue !");
		}
	}
	
	/* method removes an element from the top of the queue*/
	 
	public void dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Underflow ! Unable to remove element from Queue");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println("Pop operation done ! removed: " + queueArr[front - 1]);
				front = 0;
			} else {
				System.out.println("Pop operation done ! removed: " + queueArr[front - 1]);
			}
			currentSize--;
		}
	}

	/* Method checking whether the queue is full or not */
	public boolean isQueueFull() {
		boolean status = false;
		if (currentSize == capacity) {
			status = true;
		}
		return status;
	}

	 /* Method checking whether the queue is empty or not*/
	 
	public boolean isQueueEmpty() {
		boolean status = false;
		if (currentSize == 0) {
			status = true;
		}
		return status;
	}

	public static void main(String a[]) {

		QueueUsingArray queue = new QueueUsingArray(4);/* Defining the size of queue */
		queue.enqueue(4);
		queue.dequeue();
		queue.enqueue(56);
		queue.enqueue(2);
		queue.enqueue(67);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(24);
		queue.dequeue();
		queue.enqueue(98);
		queue.enqueue(45);
		queue.enqueue(23);
		queue.enqueue(435);
	}
}