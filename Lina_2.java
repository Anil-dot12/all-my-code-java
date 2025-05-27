public class Lina_2 {
	String n;
	boolean valueSet = false;
	
	synchronized String getMessage() {
		while(!valueSet){
			try {
				wait();	
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("consumed Message: " + n);
		valueSet = false;
		notify();
		return n;
}
	
	synchronized void putMessage(String n) {
		while(valueSet){
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");	
			}
			}
		this.n = n;
		valueSet = true;
		System.out.println("producesed Message: " + n);
		 notify();
	}
	
	public static void main(String args[]) {
		 Lina_2 L = new Lina_2();
		 new Producer(L);
		 new Consumer(L);
		 
		 System.out.println("Produces and consumes digits");
	}}
