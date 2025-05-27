import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class amjaad {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Distance Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Distance in miles:");
        JTextField textField = new JTextField(10);
        JButton convertButton = new JButton("Convert!");
        

        topPanel.add(label);
        topPanel.add(textField);
        topPanel.add(convertButton);

        JTextArea textArea = new JTextArea(5, 25);
        textArea.setEditable(false);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double miles = Double.parseDouble(textField.getText());
                    double kms = miles * 1.60934; 
                    textArea.append(miles + " miles = " + kms + " km\n");
                } catch (NumberFormatException ex) {
                    textArea.append("Invalid input!\n");
                }
            }
        });

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

         
        frame.setVisible(true);
    }
}
