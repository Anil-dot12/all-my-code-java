package Lina_A2;
import java.io.*;
import java.net.*;
public class Client_1 {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",1275);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			
			BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
			String userInput;
			while (true) {
				System.out.print("Client: ");
				userInput = consoleInput.readLine();
				
				out.println(userInput);
				
				if (userInput.equalsIgnoreCase("exit")) {
					break;
				}
				
				
				String serverMessage = in.readLine(); 
				System.out.println("Server: " + serverMessage);
			}
			socket.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
