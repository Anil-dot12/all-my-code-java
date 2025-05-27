
class Producer implements Runnable {
	Lina_2 L;
	
	Producer(Lina_2 L) {
		this.L = L;
		Thread t =new Thread(this, "Producer");
		t.start();
	}
	public void run() {
		int i = 0;
		while (true) {
			L.putMessage("Message " + i++);
		}
	}
}
