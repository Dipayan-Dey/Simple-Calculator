
/**
 * calculator
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

class Form extends JFrame implements ActionListener {

    Container c;
    JLabel label1, label2;
    JTextField t1, t2;
    // JPasswordField password;
    JButton addition, sub, mul, div;
    JLabel Result;
    Cursor cr;
    Font font;

    Form() {
        c = this.getContentPane();
        c.setLayout(null);

        // label start
        Result = new JLabel("Result:");
        Result.setBounds(100, 250, 300, 30);
        font = new Font("Arial", Font.BOLD, 16);
        Result.setFont(font);
        c.add(Result);

        label1 = new JLabel("First Number:");
        label2 = new JLabel("Second Number:");

        label1.setBounds(20, 100, 150, 30);
        label2.setBounds(20, 150, 150, 30);

        font = new Font("Arial", Font.BOLD, 16);
        label1.setFont(font);
        label2.setFont(font);
        c.add(label1);
        c.add(label2);
        // label end

        // textfield start
        t1 = new JTextField();
        t1.setBounds(150, 100, 200, 30);
        c.add(t1);
        // textfield end
        // passfield start
        t2 = new JTextField();
        t2.setBounds(150, 150, 200, 30);
        c.add(t2);
        // passfield end

        addition = new JButton("+");
        addition.setBounds(20, 200, 50, 30);
        cr = new Cursor(Cursor.HAND_CURSOR);
        addition.setCursor(cr);
        font = new Font("Arial", Font.BOLD, 16);
        addition.setFont(font);
        addition.addActionListener(this);
        c.add(addition);

        sub = new JButton("-");
        sub.setBounds(100, 200, 50, 30);
        cr = new Cursor(Cursor.HAND_CURSOR);
        sub.setCursor(cr);
        font = new Font("Arial", Font.BOLD, 16);
        sub.setFont(font);
        sub.addActionListener(this);
        c.add(sub);

        mul = new JButton("*");
        mul.setBounds(175, 200, 50, 30);
        cr = new Cursor(Cursor.HAND_CURSOR);
        mul.setCursor(cr);
        font = new Font("Arial", Font.BOLD, 16);
        mul.setFont(font);
        mul.addActionListener(this);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(250, 200, 50, 30);
        cr = new Cursor(Cursor.HAND_CURSOR);
        div.setCursor(cr);
        font = new Font("Arial", Font.BOLD, 16);
        div.setFont(font);
        div.addActionListener(this);
        c.add(div);

        setTitle("Calculator");
        setSize(400, 400);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == addition) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a + b;
                Result.setText("Result: " + c);

            }
            if (e.getSource() == sub) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a - b;
                Result.setText("Result: " + c);

            }
            if (e.getSource() == mul) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a * b;
                Result.setText("Result: " + c);

            }
            if (e.getSource() == div) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a / b;
                Result.setText("Result: " + c);

            }
        } catch (NumberFormatException e1) {
            Result.setText("Please Input Only Number");

        }

    }
}

public class calculator {

    public static void main(String[] args) {
        Form login = new Form();
    }
}