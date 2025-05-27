package Ali;

public class LinkedList {
	   private Lina head;
	    private Lina tail;

	    public LinkedList() {
	        this.head = null;
	        this.tail = null;
	    }

	    public void AddToEnd(int data) {
	        Lina newNode = new Lina(data);
	        if (!(head == null)) {
	        	 tail.next = newNode;
		            newNode.prev = tail;
		            tail = newNode;
	        } else {
	            head = newNode;
	            tail = newNode;
	        }
	    }
	  
	    public int removeFromEnd() {
	    	int e=tail.data;
	        if (head ==tail) {
	        	System.out.println("The doubly linked list is empty");
	        }  else  {
	        	tail=tail.prev;
	        	tail.next=null;
	        }
			return e;	        
	    }
	    

	    public void display() {
	        Lina current = head;
	       
	       
	        while (current != null) {
	            System.out.println(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	    
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        System.out.println("Add to head: ");
	        
	        list.AddToEnd(1);
	        list.AddToEnd(2);
	        list.AddToEnd(3);
	        list.AddToEnd(4);
	        
	        list.display();
	        
	        System.out.println("Add to tail: ");
	        
	        list.AddToEnd(1);
	        list.AddToEnd(2);
	        list.AddToEnd(3);
	        list.AddToEnd(4);
	        
	        list.display();
	    }
	}
