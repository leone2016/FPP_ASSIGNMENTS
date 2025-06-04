package Lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Letters extends JFrame {
    private JTextField countLettersTextField;
    private JTextField reverseLettersTextField;
    private JTextField removeDuplicatesTextField;
    private JLabel Input;
    private JLabel Output;
    private JTextField textField1;
    private JTextField textField2;
    private JButton CountLetters;
    private JButton ReverseLetters;
    private JButton RemoveDuplicates;
    private JPanel Letters;


    public Letters() {
        setTitle("String Utility");
        setContentPane(Letters);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);
        CountLetters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField1.getText();
                String output = textField2.getText();
                int count = 0;
                for(int i = 0 ; i < input.length(); i++){
                    char o= input.charAt(i);
                    count++;
                }
                textField2.setText(String.valueOf(count));

            }
        });
        ReverseLetters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String output = textField2.getText();
                String input = textField1.getText();
                String s = "";
                for(int i=input.length() - 1; i >= 0; i--){
                    s += input.charAt(i);
                }
                textField2.setText(s);
            }
        });
        RemoveDuplicates.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField1.getText();
                String output = textField2.getText();
                String s = "";
                for(int i=0; i < input.length(); i++){
                    char ch = input.charAt(i);
                    if (s.indexOf(ch) == -1) {
                        s += ch;
                    }

                }
                textField2.setText(s);

            }
        });
    }

    public static void main(String[] args) {
        new Letters();
    }
}
