import javax.swing.*;
		public class MyFirstSimpleGUI {
		 public MyFirstSimpleGUI() {
		  String response =JOptionPane.showInputDialog("Enter a grade to check wether the student is passed or not");
		  if(isPassed(response)) {
		   JOptionPane.showMessageDialog(null, "The grade is " + response + ". the student is passed");
		  }
		  else {
		   JOptionPane.showMessageDialog(null, "The grade is " + response + ". the student is not passed");
		  }
		 }
		 boolean isPassed(String input) {
		  int grade = Integer.parseInt(input);
		  if(grade>=60) {
		   return true;
		  }
		   return false; 
		 }
		 public static void main(String[] args) {
		  new MyFirstSimpleGUI();
		 }
		}


