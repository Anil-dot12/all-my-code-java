import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab3 extends JFrame {

    // Constructor for LanguageFrame
    public lab3() {
        setTitle("JRadio Button native language");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Label
        add(new JLabel("Your native language is"));

        // Radio buttons for language selection
        JRadioButton B1 = new JRadioButton("Arabic");
        JRadioButton B2 = new JRadioButton("English");
        JRadioButton B3 = new JRadioButton("Germany");
        JRadioButton B4 = new JRadioButton("French");

        // Group the radio buttons.
        ButtonGroup g = new ButtonGroup();
        g.add(B1);
        g.add(B2);
        g.add(B3);
        g.add(B4);

        // Add radio buttons to the frame.
        add(B1);
        add(B2);
        add(B3);
        add(B4);

        // Submit button
        JButton submitButton = new JButton("SUBMIT");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedLanguage = null;
                if (B1.isSelected()) {
                    selectedLanguage = "Arabic";
                } else if (B2.isSelected()) {
                    selectedLanguage = "English";
                } else if (B3.isSelected()) {
                    selectedLanguage = "Germany";
                } else if (B4.isSelected()) {
                    selectedLanguage = "French";
                }

                JOptionPane.showMessageDialog(lab3.this,
                        "Your selected native language is: " + selectedLanguage);
            }
        });
        add(submitButton);

        // Make the frame visible
        setVisible(true);
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new lab3();
            }
        });
    }
}
