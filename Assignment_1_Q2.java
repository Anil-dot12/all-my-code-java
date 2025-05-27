import javax.swing.*; 
import java.awt.*; 
public class Assignment_1_Q2 extends JFrame { 

	public Assignment_1_Q2() { 
        setTitle("GRID LAYOUT WITH SPACE"); 
        setSize(300, 300); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(new GridLayout(3, 3, 12, 15)); 
        int i = 1;
        while ( i <= 9) { 
            JButton b = new JButton(String.valueOf(i)); 
            add(b);
            i++;}} 
    public static void main(String[] args) { 
    	Assignment_1_Q2 Lina = new Assignment_1_Q2(); 
               Lina.setVisible(true);}}
