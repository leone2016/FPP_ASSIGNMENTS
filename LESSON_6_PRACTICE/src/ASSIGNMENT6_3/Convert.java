package ASSIGNMENT6_3;

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
        Convert.addActionListener(e -> {

            // 1 mile = 1.60934 km
            if(!textField1.getText().isEmpty()){
                double mile = parseDouble(textField1.getText());
                double kilometer = mile * 1.60934;
                textField5.setText(Double.toString(kilometer));

            }

            if(!textField2.getText().isEmpty()){
                // 1 pound = 0.453592 kg
                double pound = parseDouble(textField2.getText());
                double kg = pound * 0.453592;
                textField6.setText(Double.toString(kg));
            }

            if(!textField3.getText().isEmpty()){
                // 1 gallon = 3.78541 liter
                double gallon = parseDouble(textField3.getText());
                double liter = gallon * 3.78541;
                textField7.setText(Double.toString(liter));
            }

            if(!textField4.getText().isEmpty()){
                //1 fahrenheit = -17.2222centigrade
                double fahrenheit = parseDouble(textField4.getText());
                double centigrade = (fahrenheit - 32) * 5.0 / 9.0;
                textField8.setText(Double.toString(centigrade));
            }

        });
    }

    public static void main(String[] args) {
        new Convert();
    }
}
