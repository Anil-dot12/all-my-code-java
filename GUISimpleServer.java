package lap_oop;
import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUISimpleServer extends JFrame implements ActionListener {
 Container cp;
 JTextArea ta;
 JTextField tf;
 JButton b1, b2;
 JLabel l1, l2;
 JPanel p;
 ServerSocket ss;
 Socket s;
 PrintWriter pw;
 String str;
 Scanner sc;

 GUISimpleServer() {

  cp = getContentPane();

  //l1 = new JLabel("Messages from the Client");
  l2 = new JLabel("Enter Message to the Client");

  ta = new JTextArea();

  tf = new JTextField(20);

  b1 = new JButton("SEND");
  b2 = new JButton("CLEAR");

  b1.addActionListener(this);
  b2.addActionListener(this);

  p = new JPanel();
  p.add(l2);
  p.add(tf);
  p.add(b1);
  p.add(b2);

  //cp.add(l1, "North");
  cp.add(ta);
  cp.add(p, "South");

  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Server");
  setSize(600, 400);
  setVisible(true);

  chat();

 }

 public void chat() {
  try {
   ss = new ServerSocket(6791);
   /*System.out.println("Server is Running...\n");
   ta.append("Server is Running...\n");
   ta.append("Server is waiting for the Client to be Connected.\n");*/
   s = ss.accept();
   //ta.append("Client Connection Established\n");
   sc = new Scanner(s.getInputStream());

   str = sc.nextLine();

   ta.append("Client : " + str);

   pw = new PrintWriter(s.getOutputStream(), true);

  } catch (Exception e) {
  }
 }

 public void actionPerformed(ActionEvent ae) {
  if (ae.getSource() == b1) {
   str = tf.getText();
   pw.println(str);
   ta.append(" \n Server  : " + str + "\n");
   tf.setText("");
  } else if (ae.getSource() == b2) {
   tf.setText("");
  }
 }

 public static void main(String[] args) throws Exception {
  new GUISimpleServer();

 }
}
