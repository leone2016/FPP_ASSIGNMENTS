import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterForm extends JFrame{
    private JButton btnInc;
    private JLabel lblCount;
    private JPanel panel1;

    public CounterForm() {
        setTitle("Counter");

        setContentPane(panel1);

        setVisible(true);
        pack();
        int count = 0;
        btnInc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(lblCount.getText());
                lblCount.setText(""+ ++i);
            }
        });
    }
    public static void main(String args[]){

        new CounterForm();
    }
}
