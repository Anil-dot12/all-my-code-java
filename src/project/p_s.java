package project;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class p_s {
	

    public p_s() throws IOException {
        System.out.println(" waiting for a new connection...");
        ServerSocket welcomeSocket = new ServerSocket(996); // 1. Initialize the server socket.

        // Continuously listen for incoming connections.
        while (true) {
            Socket connectionSocket = welcomeSocket.accept(); // 2.Accept an incoming client connection.
            System.out.println("Server is accepting a new client");
            
            Runnable clientRunnable = new CalcRunnable(connectionSocket); // 3.Create a new thread to handle the client.
            Thread thread = new Thread(clientRunnable); // Assign the task to a new thread.
            thread.start(); // Start the thread to process the client's request.
        }//end while
    }//end constuctor
    
   
	
    public static void main(String args[]) throws IOException {
        new p_s(); // Start the server.
    } //end main  
    
}//end tcp Server

class CalcRunnable implements Runnable {
	
	private Socket connectionSocket; // Socket connected to the client.
	

    public CalcRunnable(Socket connectionSocket) {
        this.connectionSocket = connectionSocket; // Assign the socket for this client.
        }
    
    public void run() {
    	
    	 try {
    		 
    		  // 4.Initialize input and output streams to communicate with the client.
             BufferedReader inFromClient = new BufferedReader(
                     new InputStreamReader(connectionSocket.getInputStream()));
             DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
          // 5.Send a welcome message to the client.
             outToClient.writeBytes(" calculator server!\n");
             outToClient.writeBytes("How many numbers of operate on?\n");
          // 6.Read the number of inputs from the client.
             int numInputs = Integer.parseInt(inFromClient.readLine().trim());
             double[] operands = new double[numInputs]; // Array to store the numbers.
          // 7.Request and receive the numbers from the client.
             outToClient.writeBytes("Please enter " + numInputs + " numbers :\n"); 
             for (int i = 0; i < numInputs; i++) {
                 operands[i] = Double.parseDouble(inFromClient.readLine().trim());}
          // 8.Ask the client to choose an operation.
             outToClient.writeBytes("ReadOp\n");
             String operation = inFromClient.readLine().trim();          
             // 9.Performing the Operation
             double result = operands[0];
             for (int i = 1; i < operands.length; i++) {
            	 
                 switch (operation) {
                     case "1":
                         result += operands[i];
                         break;
                     case "2":
                         result -= operands[i];
                         break;
                     case "3":
                         result *= operands[i];
                         break;
                     case "4":
                         if (operands[i] == 0) {
                             outToClient.writeBytes("Error: Division by zero.\n");
                             return;}
                         result /= operands[i];
                         break;
                     default:
                         outToClient.writeBytes("Invalid operation.\n");
                         return;
                 }//end switch
             }//end for           
          // 10. the Result
             outToClient.writeBytes("Result: " + result + "\n");    		     		 
    	 }//end try
    	 catch (Exception e) {//11. print error
             System.out.println("Error");
         }   	
    }//end run    	
}//end CalcRunnable



        