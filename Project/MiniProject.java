package Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MiniProject extends JFrame implements ActionListener,ItemListener{
 JMenuBar mb;
 JMenu f,c;
 JMenuItem fmi1, fmi2, fmi3;
 private JLabel WLabel,nLabel,phoneLabel,emailLabel,GLabel;
 private JTextField name,phone,Email;
 private JComboBox c1;
 JRadioButton [] Radio;
 private JCheckBox[] checkbox;
 private JTextArea summary;
 private JButton submitButton,clearButton;
 

public MiniProject() {
 Container C1 = getContentPane();
 C1.setLayout(new FlowLayout());
 C1.setBackground(new Color(0xE6E6FA));
    fmi1 = new JMenuItem("Open");
    fmi2 = new JMenuItem("Save");
    fmi3 = new JMenuItem("Exit");
    fmi1.addActionListener(this);
    fmi2.addActionListener(this);
    fmi3.addActionListener(this);
     f = new JMenu("File");
     mb = new JMenuBar();
      f.add(fmi1);
      f.add(fmi2);
      f.addSeparator();
      f.add(fmi3);
      mb.add(f);
      
      setJMenuBar(mb);
      setTitle("Library");
      setSize(460, 560);
      setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       ImageIcon icon = new ImageIcon("C:\\Users\\Huawei\\OneDrive\\Desktop\\R.jpeg","");
         Image image = icon.getImage(); 
         Image NewImg = image.getScaledInstance(50, 50,java.awt.Image.SCALE_SMOOTH);
         ImageIcon newImageIcon = new ImageIcon(NewImg);
         JLabel ImgLab = new JLabel(newImageIcon, JLabel.LEFT);

      JPanel FirPanle,UPpanle;
        FirPanle = new JPanel();
        FirPanle.setBackground(new Color(0x808080));
        WLabel = new JLabel(" Welcome to Library ");
        WLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        FirPanle.add(WLabel);
        FirPanle.add(ImgLab);
        C1.add(FirPanle);

     UPpanle = new JPanel();
      UPpanle.setBackground(new Color(0xE6E6FA));
      UPpanle.setLayout(new GridLayout(3,3));
      nLabel = new JLabel("Name:");
      UPpanle. add(nLabel);
      name = new JTextField(20);
      UPpanle.add(name);
      phoneLabel = new JLabel("Phone:");
      UPpanle.add(phoneLabel);
    phone = new JTextField(20);
      UPpanle.add(phone);
    emailLabel = new JLabel("Email:");
      UPpanle.add(emailLabel);
    Email= new JTextField(20);
      UPpanle.add(Email);
      C1.add(UPpanle);

  JPanel PanelS = new JPanel();
     PanelS.setBackground(new Color(0xE6E6FA));
     PanelS.setLayout(new FlowLayout());
  ButtonGroup bg=new ButtonGroup();
  GLabel = new JLabel("Gender :");
     String RadioArray[] = { "Woman", "Man"};
  Radio = new JRadioButton[RadioArray.length];
    for (int i = 0; i < Radio.length; i++) {
  Radio[i] = new JRadioButton(RadioArray[i]);
   Radio[i].addItemListener(this);
   bg.add(Radio[i]);
   PanelS.add(Radio[i]);}
   Radio[0].setSelected(true);
   C1.add(GLabel);
   C1.add(PanelS);
   
 JLabel R = new JLabel("Choose Your Job: ");
 JPanel PanelW = new JPanel(new GridLayout(2,1));
  PanelS.setBackground(new Color(0xFDF5E6));
  PanelW.setBackground(new Color(0xFDF5E6));
   String s1[] = { "student ", "employee", "unemployed","Others"};
 c1 = new JComboBox(s1);
   c1.addItemListener(this);
   PanelW.add(R);
   PanelW.add(c1);
   C1.add(PanelW);


JPanel PanelX = new JPanel();
JLabel Lable = new JLabel("Classification of books: ");
PanelX.setBackground(new Color(0xFDF5E6));
String stars[] = {"Scientific books", "Educational Books", "Historical books"};
checkbox = new JCheckBox[stars.length];
for (int i = 0; i < checkbox.length; i++) {
checkbox[i] = new JCheckBox(stars[i]);
checkbox[i].addActionListener(this);
PanelX.add(checkbox[i]);
}
C1.add(Lable);
C1.add(PanelX);

JPanel PanelM = new JPanel();
JLabel summaryLable = new JLabel("order Summary");
PanelM.add(summaryLable);
PanelM.setBackground(new Color(0xE6E6FA));
summary = new JTextArea(10,30);
summary.setText(" Summary ..... ");
summary.setEditable(false);
PanelM.add(summary);
C1.add(PanelM);
JPanel PanelB = new JPanel();
submitButton = new JButton("Submit");
submitButton.addActionListener(this);
PanelB.add(submitButton);
clearButton = new JButton("Clear");
clearButton.addActionListener(this);
PanelB.add(clearButton);
C1.add(PanelB);
}
public static void main(String[] args) {
MiniProject m= new MiniProject();
m.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
String s = e.getActionCommand();
if (s.equals("Submit")) {
String x= name.getText();
summary.append("\n Name : "+x );
nLabel.setText("");
x= phone.getText();
summary.append("\nPhone Number : "+x);
x= Email.getText();
summary.append("\nEmail : "+x );
String k =null;


int i =0;
while(k == null){
if (Radio[i].isSelected()){
k=Radio[i].getText();
}
i++;
}
summary.append("\nGender : "+ k);
String combo =(String) c1.getSelectedItem();
summary.append("\nYour Job: "+combo);
for (int j=0;j< checkbox.length;j++){
if (checkbox[j].isSelected())
summary.append("\nBook Type : "+ checkbox[j].getText());
}
}
else if (s.equals("Clear")){
name.setText("");
phone.setText("");
Email.setText("");
summary.setText("");
       }}
    public void itemStateChanged(ItemEvent e){}
     }