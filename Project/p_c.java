package project;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class p_c {
	
    public static void main(String args[]) throws IOException {
    	
    	try{
    	// 1. Connect to the server running on localhost .
        Socket clientSocket = new Socket("localhost", 996);
        
        Scanner scan = new Scanner(System.in); // 2.For reading user input.
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream()); // 4.To send data to the server.
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // 5.To receive data from the server.

        // 6.Read and display the server's welcome message.
        System.out.println(inFromServer.readLine()); // Welcome message
        System.out.println(inFromServer.readLine()); // Request for number of inputs
        
        
     // 7.Send the number of inputs to the server.
        System.out.print("Enter the number of inputs: ");
        int numInputs = Integer.parseInt(scan.nextLine());
        outToServer.writeBytes(numInputs + "\n");
        
     // 8.Read and send the numbers to the server.
        System.out.println(inFromServer.readLine()); // Request for inputs
        for (int i = 0; i < numInputs; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            String operand = scan.nextLine();
            Double.parseDouble(operand);//check if number is double
            outToServer.writeBytes(operand + "\n");
        } 
        
        
        // 9.Confirm the server is ready for the operation selection.
        if (inFromServer.readLine().equalsIgnoreCase("ReadOp")) {
            // Request the user to choose an operation.
            System.out.print("Enter the operation Number (1. Add, 2. Sub, 3. Mul, 4. Div): ");
            String operation = scan.nextLine();
            outToServer.writeBytes(operation + "\n");

            // 10.Receive and display the result from the server.
            String result = inFromServer.readLine();
            System.out.println(result.trim());
        }}//end try
    	catch(Exception ex) {//11. print Error
    		
    		System.out.println("Error");
    	}//end catch
    }//end main
}


  
  
