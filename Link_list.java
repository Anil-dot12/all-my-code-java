import java.util.LinkedList;
public class Link_list {
	public static void main(String[] args) {
		LinkedList <Integer> Lina=new LinkedList();
		Lina.add(23);
		Lina.add(20);
		Lina.add(89);
		Lina.add(2);
		Lina.add(13);
		Lina.add(8);
		System.out.println("After add Element:"+Lina);
		
		Lina.addFirst(5);
		Lina.addLast(3);
		
		System.out.println("After add Element in (first and last) : "+Lina);
		
		Lina.removeFirst();
		Lina.removeLast();
		System.out.println(Lina);
		
		System.out.println("remove the first :"+Lina.getFirst());
		System.out.println("remove the last: "+Lina.getLast());
		}
}
