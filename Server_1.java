package Lina_A2;
import java.io.*; 
import java.net.*;
public class Server_1 {
	public static void main(String[] args) {
		try {
			ServerSocket serverS = new ServerSocket(1275);
			
			System.out.println("Server is waiting for a client to connect...");
			
			Socket clientSocket = serverS.accept();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader serverIn = new BufferedReader(new InputStreamReader(System.in));
			
			while (true) {
				String clientMessage;
				try {
					clientMessage = in.readLine();
				}catch (SocketException se) {
					System.out.println("Client disconnected.");
					break;
				}
				if (clientMessage == null) { 
					System.out.println("Client disconnected.");
					break;
				}
				System.out.println("Client: " + clientMessage);
				
				System.out.print("Server: ");
				String serverMessage = serverIn.readLine();
				out.println(serverMessage);
			}
			serverS.close();
			
		}catch (IOException e) {
			e.printStackTrace();}
	}}
