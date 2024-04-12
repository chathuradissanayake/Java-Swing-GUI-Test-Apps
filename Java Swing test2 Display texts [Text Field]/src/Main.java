
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JTextField textField;


    MyFrame(){
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 25));   //custom size textfield
        textField.setColumns(15);
        textField.setText("Welcome");

        button = new JButton("Click");
        button.setBackground(Color.magenta);
        button.setForeground(Color.white);
        label = new JLabel("Empty Field");
        label.setForeground(Color.white);


        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);

        this.add(label);

        button.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){

            label.setText(textField.getText());
        }

    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Text display Application");
        frame.setSize(420, 420);
        frame.getContentPane().setBackground(new Color(62, 62, 62));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}