package Lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;

public class Convert extends JFrame {
    private JPanel panel1;
    private JLabel Mile;
    private JLabel Pound;
    private JLabel Gallon;
    private JLabel Fahrenheit;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel Kilometer;
    private JLabel Kilogram;
    private JLabel Liter;
    private JLabel Centigrade;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton Convert;

    public Convert() {
        setTitle("Metric Conversion Assistant");
        setContentPane(panel1);
        setSize(600,380);
        setLocationRelativeTo(null);
        setVisible(true);
        Convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double mile = parseDouble(textField1.getText());
                double kilometer = mile * 1.60934;
                // 1 mile = 1.60934 km
                //1 pound = 0.453592 kg
                //1 gallon = 3.78541liter
                //1 fahrenheit = -17.2222centigrade
                textField5.setText(Double.toString(kilometer));
            }


        });
    }

    public static void main(String[] args) {
        new Convert();
    }
}
