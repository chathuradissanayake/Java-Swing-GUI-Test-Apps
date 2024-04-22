import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JCheckBox check1, check2;
    JTextField textField;
    MyFrame(){
        check1 = new JCheckBox("Bold");
        check2 = new JCheckBox("Italic");

        textField = new JTextField();
        textField.setColumns(20);

        this.setLayout(new FlowLayout());
        this.add(check1);
        this.add(check2);
        this.add(textField);

        check1.addActionListener(this);
        check2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
//        if(check1.isSelected()){
//            textField.setFont(new Font("Arial", Font.BOLD, 15));
//        }
//        if(check2.isSelected()){
//            textField.setFont(new Font("Arial", Font.ITALIC, 15));
//        }

        int bold = 0;
        int italic = 0;

        if(check1.isSelected()){
            bold = Font.BOLD;
        }
        if(check2.isSelected()){
            italic = Font.ITALIC;
        }
        textField.setFont(new Font("Serif", bold | italic, 12));
    }

}
public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Check Box");
        frame.setSize(420, 420);
        frame.getContentPane().setBackground(new Color(177, 248, 95));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}