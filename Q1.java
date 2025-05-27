public class Q1 {
 static private int []array;
 static private int front ;
 static private int rear;
 static private int size;
 
 Q1(int capacity){
  array=new int [capacity];
  front =0;
  rear=-1;
  size =0;}
 
//add element
 public void enqueue(int t) {
  if(isFull()) {
   System.out.println("Queue is Full");
   return;}
  rear++;
  array[rear]=t;
  size++;}
 
//remove element
 public int dequeue() {
  if( isEmpty()) {
   System.out.println("Queue is Empty");
   return-1;}
  int t =array[front];
  front ++;
  size --;
  return t;}
 
//the front element 
 public int peek() {
	  if(isEmpty()) {
	   System.out.println("Queue is Empty");
	   return -1;}
	  return array[front];}
 
//print Queue element 
 static void queuedisplsy() {
  if(front == rear) {
   System.out.println("Queue is Empty");
   return;
  }
  System.out.println("Queue Element: ");
  for (int i= front ; i<=rear ;i++) {
   System.out.print(array[i]+"|");}
  System.out.println("");
  return;}
 
 /////////////////////// 
 public boolean isEmpty() {
  return size == 0 ; }
 //////////////////////// 
 public boolean isFull() {
  return rear == array.length -1;}
//////////////////////////
 public int size () {
  return size ;}
 //////////////////////
 
  public static void main(String[] args) {
  
  Q1 L =new Q1(9);
  
        L.enqueue(9);
        L.enqueue(6);
        L.enqueue(10);
        L.enqueue(4);
        L.enqueue(3);
        L.enqueue(1);
        L.enqueue(2);
        L.queuedisplsy();
        System.out.println("\nSize Queuet: " + L.size());
        
        System.out.println("\npeek element: " + L.peek());
        System.out.println("Delet element: "+ L.dequeue());
        System.out.println();
        System.out.println("peek element: " + L.peek());
        System.out.println("Delet element: "+ L.dequeue());
        
        System.out.println();
        L.queuedisplsy();
        
        L.enqueue(5);
        L.enqueue(12);
        L.enqueue(11);
       System.out.println("\nDelet element: "+ L.dequeue());
       
       System.out.println();
       System.out.println("\nQueuet is Empty: " + L.isEmpty());
       System.out.println();
        L.queuedisplsy(); }}
