public class Lina_5_2 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
	 Lina_5 t1 =new Lina_5("One");
	 Lina_5 t2 =new Lina_5("Two");
System.out.println("Priority of the Thread ONE  "+ t1.t.getName() +" is "+t1.t.getPriority());
System.out.println("Priority of the Thread TWO "+t2.t.getName()+" is "+t2.t.getPriority() );

t1.t.setPriority(Thread.MAX_PRIORITY);
System.out.println("Priority of the Thread one "+t1.t.getName()+" is "+t1.t.getPriority());
t2.t.setPriority(Thread.MIN_PRIORITY);
System.out.println("Priority of the Thread one "+t2.t.getName()+" is "+t2.t.getPriority());
t1.t.start();
t2.t.start();
try {
 Thread.sleep(8000);
}catch (InterruptedException e) {
 System.out.println("Error ");
}
System.out.println("Main thread exiting");
 }}

