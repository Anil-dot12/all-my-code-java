import java.util.Vector;
public class vector {
	public static void main(String[] args) {
		Vector <String> animals =new Vector <String>(3);
		animals.add("cat");
		animals.add("hamster");
		animals.add("rabbit");
		System.out.println("Vector after adding -->"+animals);
		System.out.println("Vector Size: "+animals.size());
		System.out.println("Vector capacity: "+animals.capacity());
		
		animals.remove(0);
		animals.remove(0);
		System.out.println("Vector after remove -->"+animals);
		System.out.println("Vector Size: "+animals.size());
		System.out.println("Vector capacity: "+animals.capacity());
		
		animals.add("tiger");
		animals.add("deerdeer");
		animals.add("fox");
		animals.add("bear");
		animals.add("elephant");
		System.out.println("Vector after adding -->"+animals);
		System.out.println("Vector Size: "+animals.size());
		System.out.println("Vector capacity: "+animals.capacity());
	
		
		animals.remove(2);
		animals.add(2, "dove");
		System.out.println("final state of the Vector: "+animals);
	}
}
