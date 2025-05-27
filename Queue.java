public class Queue {

	int S;
	int [] el;
	int f,r;
	
	public Queue(int s) {
		S=s;
		el =new int[S];
		f=-1;
		r=-1;
	}
	////////////
	public boolean isFull() {
		if(f==0&&r==S-1) {
			return true;
		}
		return false;
	}
	////////////
	public boolean isEmpty() {
		if(f==-1 && r==-1) {
			return true;
		}
		return false;
	}
	///////////
	public void engueu(int El) {
		if(isFull()) {
			System.out.println("Quqe is full");
		}else if(isEmpty()) {
			f=r=0;
			el[r]=El;
		}else {
			r++;
			el[r]=El;
			System.out.println("insert "+ El);
		}	
	}
	
	public void degueu() {
		if(isEmpty()) {
			System.out.println("Quqe is Empty!!");
		}else if(f==r) {
			f=r=-1;
		}else {
			f++;
		}	
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("Quqe is Empty!!");
			}else {
//				System.out.println("index front: "+f);
//				System.out.println("index rear: "+r);
				System.out.println("\nelement: ");
				for(int i=f;i<=r;i++) {
					System.out.print(el[i]+" ");}
			}System.out.println("");
		}
	
	
	public static void main(String[] args) {
		Queue L=new Queue(5);
		L.engueu(2);
		L.engueu(1);
		L.engueu(4);
		L.engueu(9);
		L.engueu(10);
		
		System.out.println("after remove from Queue:");
		L.display();
		System.out.println("after remove from Queue:");
		L.degueu();
		L.degueu();
		L.display();
		
		L.engueu(5);
		L.engueu(6);
		
		System.out.println(" Queue is Empty :"+L.isEmpty());
		System.out.println(" Queue is full:"+L.isFull());
		}}
