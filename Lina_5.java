public class Lina_5 implements Runnable{
	 Thread t;
	 String name;	 
	   Lina_5(String n){
	   t =new Thread(this,n);}	  
	 public void run() {
	   for(int i=1;i<=5;i++) {
	    System.out.println("Thread "+t.getName()+"i="+i);
	    try {
	     Thread.sleep(1000);
	    }catch (InterruptedException e) {
	     System.out.println("error");}}
	   System.out.println("child thread exiting"); }}
