package ASSIGNMENT6_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameAddress extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton Submit;
    private JPanel panel1;
    private JLabel Name;
    private JLabel Street;
    private JLabel City;
    private JLabel State;
    private JLabel Zip;

    public NameAddress(){
        setTitle("Address Form");
        //setDefaultCloserOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String street = textField2.getText();
                String city = textField3.getText();
                String state = textField4.getText();
                String zip = textField5.getText();

                System.out.println(name);
                System.out.println(street);
                System.out.println(city + "," + state + " " + zip);

            }
        });
    }

    public static void main(String[] args) {
        new NameAddress();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
