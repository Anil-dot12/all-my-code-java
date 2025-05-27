package lap_oop;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class GUISimpleClient1 extends JFrame implements ActionListener {
    /**
  * 
  */
 private static final long serialVersionUID = 1L;
 Container cp;
    JTextArea ta;
    JTextField tf;
    JButton b1, b2;
    JLabel l1, l2;
    JPanel p;

    Socket s;
    PrintWriter pw;
    BufferedReader br;
    String str;
    Scanner sc;

    GUISimpleClient1() {
        cp = getContentPane();

        //l1 = new JLabel("Messages from the Server");
        l2 = new JLabel("Enter Message to the Server");

        ta = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(ta);
        ta.setEditable(false);

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
        cp.add(scrollPane);
        cp.add(p, "South");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(800, 0);
        setTitle("Client");
        setSize(600, 400);
        setVisible(true);

        chat();
    }
    public void chat() {
  try {
   s = new Socket("localhost", 6791);
  
   pw = new PrintWriter(s.getOutputStream(), true);
   
   sc = new Scanner(s.getInputStream());
   
   str = sc.nextLine();
  
   ta.append("Server: "+str);
  
  }catch(Exception e){
  }
 }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            str = tf.getText();
            pw.println(str);
            ta.append("client  : " + str + "\n");
            tf.setText("");
        } else if (ae.getSource() == b2) {
            tf.setText(""); }}

    public static void main(String[] args) throws Exception {
        new GUISimpleClient1();
    }}
