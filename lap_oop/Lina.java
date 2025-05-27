package lap_oop;

public class Lina implements Runnable{
 Thread t;
 String name;
 
   Lina(String n){
   t =new Thread(this,n);
  }
  @Override
  
 public void run() {
   for(int i=1;i<=5;i++) {
    System.out.println("Thread "+t.getName()+"i="+i);
    try {
     Thread.sleep(1000);
    }catch (InterruptedException e) {
     System.out.println("error");
    }
    
    
   }
   System.out.println("child thread exiting");
 }
  
  }
