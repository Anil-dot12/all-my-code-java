import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class Thread_ImgCatalog extends JFrame implements ActionListener {
 Container cp;
 
 private JLabel imageLabel;
 private JButton startButton;
 private String[] imagePaths; 
 private int currentIndex = 0;
 private Thread imageThread;
 
 public Thread_ImgCatalog() {
 setTitle("Image Catalog");
 setSize(300, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 cp = getContentPane();
 cp.setLayout(new BorderLayout());
 imagePaths = new String[]{
 "C:\\Users\\Huawei\\OneDrive\\Desktop\\OOP\\1.jpg",
 "C:\\Users\\Huawei\\OneDrive\\Desktop\\OOP\\2.jpg",
"C:\\Users\\Huawei\\OneDrive\\Desktop\\OOP\\3.jpg",
  "C:\\Users\\Huawei\\OneDrive\\Desktop\\OOP\\4.jpg"};
 
 
 imageLabel = new JLabel(new ImageIcon(imagePaths[0]));
 cp.add(imageLabel, BorderLayout.CENTER);
 startButton = new JButton("Start");
 startButton.addActionListener(this);
 cp.add(startButton, BorderLayout.SOUTH);
 }
 
 private void startImageThread() {
 imageThread = new Thread() {
 public void run() {
 while (!Thread.interrupted()) {
	 
 ImageIcon icon = new ImageIcon(imagePaths[currentIndex]);
 imageLabel.setIcon(icon);
 currentIndex = (currentIndex + 1) % imagePaths.length;
 
 imageLabel.revalidate();
 imageLabel.repaint();
 try {
 Thread.sleep(1000);
 } catch (InterruptedException e) {
 Thread.currentThread().interrupt();
 break;}}}};
 
 imageThread.start(); }

 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == startButton) {
 if (imageThread == null || !imageThread.isAlive()) {
 startImageThread(); }}}

 public static void main(String[] args) {
 new Thread_ImgCatalog().setVisible(true);}}
