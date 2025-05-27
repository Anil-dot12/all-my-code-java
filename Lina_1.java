import java.net.InetAddress;
import java.net.UnknownHostException;
public class Lina_1{
 public static void main(String[] args) {
  try {
 InetAddress localAddress = InetAddress.getLocalHost();
 System.out.println("local your   address: " + localAddress.getHostAddress());
System.out.println("local your   name: " + localAddress.getHostName());

InetAddress[] googleAddresses = InetAddress.getAllByName("www.google.com");
InetAddress[] kkuAddresses = InetAddress.getAllByName("www.kku.edu.sa");
System.out.println("\nAddresses and names of www.google.com:");
 for (InetAddress address : googleAddresses) {
System.out.println("Address: " + address.getHostAddress());
 System.out.println("Name: " + address.getHostName());
 }
System.out.println("\nAddresses and names of www.kku.edu.sa:");
 for (InetAddress address : kkuAddresses) {
 System.out.println("Address: " + address.getHostAddress());
 System.out.println("Name: " + address.getHostName());
    }
 boolean isEqual = googleAddresses[0].equals(kkuAddresses[0]);
 System.out.println("\nAddress equality between www.google.com and www.kku.edu.sa: " + isEqual);
System.out.println("\nHost name for www.google.com: " + googleAddresses[0].getHostName());
System.out.println("Host name for www.kku.edu.sa: " + kkuAddresses[0].getHostName());

boolean isMulticast = kkuAddresses[0].isMulticastAddress();
System.out.println("\n Is www.kku.edu.sa a multicast address? " + isMulticast);
} catch (UnknownHostException e) {
System.out.println("error  " + e.getMessage());
        }
    }
}
