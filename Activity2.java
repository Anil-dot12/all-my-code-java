import javax.swing.*; 
import java.awt.FlowLayout; 
import java.awt.event.*; 
public class Activity2 extends JFrame implements ActionListener{ 
 
 JLabel label_1; 
 JTextField textField; 
 JTextArea textArea; 
 JButton c,E; 

 public Activity2(){
  setTitle("Leena"); 
 
  label_1 = new JLabel("Enter a programming language:"); 
  textField = new JTextField(20); 
  textArea = new JTextArea(10, 20); 
  textArea.setEditable(false); 
  c=new JButton("Submit"); 
  E=new JButton("EXIT"); 
 
  c.addActionListener(this);  
  E.addActionListener(this);   
 
  add(label_1); 
  add(textField); 
  add(c); 
  add(textArea); 
  add(E); 
 
  setSize(400, 400); 
  setLayout(new FlowLayout()); 
  setVisible(true); } 
 
 public static void main(String[] args) { 
  new Activity2();} 
    
 public void actionPerformed(ActionEvent ae) { 
  if ((ae.getSource().equals(c)) ||(ae.getSource().equals(textField))) { 
   String text = textField.getText(); 
   textArea.append(text + "\n"); 
   textField.setText(""); 
  }  
  if (ae.getSource().equals(E)) { 
   System.exit(1); }}
 }
