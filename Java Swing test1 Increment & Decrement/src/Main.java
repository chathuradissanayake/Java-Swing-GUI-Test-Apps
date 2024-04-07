import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JButton incrementButton, dectrementButton;
    int count = 0;

    MyFrame(){
        label = new JLabel();
        label.setText("Hello "+count);
        incrementButton = new JButton("Increment");
        dectrementButton = new JButton("Decrement");

        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(incrementButton);
        this.add(dectrementButton);

        incrementButton.addActionListener(this);
        dectrementButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton){
            count++;
        }
        if (e.getSource() == dectrementButton){
            count--;
        }
        label.setText("Hello " +count);
    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Increment Application");
        frame.setSize(420, 420);
        frame.getContentPane().setBackground(new Color(126, 214, 255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}