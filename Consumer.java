
class Consumer implements Runnable { 
	Lina_2 c;
	Consumer(Lina_2 c) {
		this.c = c;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		int i = 0;
		int maxMessages=15;
		while (i < maxMessages) {
			c.getMessage();
			i++;
		}}
}
