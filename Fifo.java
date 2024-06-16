package src;

public class Fifo {
	    int data;
	    Fifo next;

	    public Fifo(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Queue {
	    private Fifo front;
	    private Fifo rear;

	    public Queue() {
	        this.front = null;
	        this.rear = null;
	    }

	    public void enqueue(int data) {
	    	Fifo newNode = new Fifo(data);
	        if (rear == null) {
	            front = newNode;
	            rear = newNode;
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	        }
	    }
	public int dequeue() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        int dequeued = front.data;
	        if (front == rear) {
	            front = null;
	            rear = null;
	        } else {
	            front = front.next;
	        }
	        return dequeued;
	    }

	    public int peek() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        return front.data;
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }
	
	    public static void main(String[] args) {
	        Queue queue = new Queue();
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
	        
	        System.out.println("Front element: " + queue.peek());
	        System.out.println("Dequeued element: " + queue.dequeue());
	        System.out.println("Front element after dequeue: " + queue.peek());
	        System.out.println("Is queue empty? " + queue.isEmpty());
	    }
	}


