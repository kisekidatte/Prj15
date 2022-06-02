import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prj15 extends JFrame {
    Prj15() {
        setSize(300, 200);
        setLocation(500, 500);
        setLayout(null);

        JLabel label = new JLabel("Число");
        label.setBounds(10, 10, 50, 30);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextField textField = new JTextField("0");
        textField.setBounds(100, 10, 50, 30);
        textField.setEditable(false);
        add(textField);

        JButton buttonPlus = new JButton("+1");
        buttonPlus.setBounds(200, 10, 50, 30);
        JButton buttonminus = new JButton("-1");
        buttonminus.setBounds(200, 50, 50, 30);





        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                if (value < 3) {
                    value++;
                    textField.setText(Integer.toString(value));
                }
            }
        });
        buttonminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                if (value > -5) {
                    value--;
                    textField.setText(Integer.toString(value));


                }
            }
        });
        add(label);

        add(buttonPlus);
        add(buttonminus);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prj15();
    }

}