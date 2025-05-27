import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Assignment_1 extends JFrame implements ActionListener{ 
	private JLabel n1; 
	private JTextField n2; 
	private JRadioButton M ,F ; 
	private JButton Enter,Cancel; 
	private String g2; 
 ///////////////////////////////////////////  
   public  Assignment_1(){
    setTitle("Lina ali- 444808738");
    setSize(400,300);  
    setLocation(480,200); 
    setResizable(false); 
    setLayout(new BorderLayout()); 
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    M = new JRadioButton("MALE"); 
    F = new JRadioButton("FEMALE"); 
    ButtonGroup B_group = new ButtonGroup(); 
    B_group.add(M); 
    B_group.add(F); 
    
    Enter = new JButton("Enter"); 
    Enter.addActionListener(this);
    Enter.setBackground(Color.white); 
    Cancel = new JButton("Cancel"); 
    Cancel.addActionListener(this); 


     JPanel nameP = new JPanel(new FlowLayout()); 
     nameP.setBorder(BorderFactory.createTitledBorder("STUDENT NAME")); 
     n1=new JLabel("name:");
     n1.setForeground(Color.yellow);
     n2 = new JTextField(20); 
     nameP.add(n1); 
     nameP.add(n2);  
    
     JPanel genderP = new JPanel(new GridLayout(0,1));  
    genderP.setBorder(BorderFactory.createTitledBorder("Select your Gender")); 
    M.setForeground(Color.BLUE); 
    F.setForeground(Color.PINK); 
    genderP.add(M);
    genderP.add(F); 
    
    JPanel LastP = new JPanel(new FlowLayout()); 
    LastP.add(Enter); 
    LastP.add(Cancel);  
        
        add(nameP, BorderLayout.NORTH); 
        add(genderP, BorderLayout.CENTER); 
        add(LastP, BorderLayout.SOUTH);} 
   
  
   
///////////////////////////////////////////  
     public static void main(String[] args) { 
      Assignment_1 Lina = new Assignment_1(); 
      Lina.setVisible(true);} 
///////////////////////////////////////////   
     public void actionPerformed(ActionEvent e) { 
       if(e.getSource()==Enter){ 
          if(M.isSelected()){           
              g2 = "MALE"; 
         }else { 
              g2 = "FEMALE";} 
       JOptionPane.showMessageDialog(null, "Your gender is " + g2); 
         }else{ 
             n2.setText("");}}}
