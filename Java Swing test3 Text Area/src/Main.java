import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextArea textArea;

    MyFrame() {
        textArea = new JTextArea(10,40);
        button = new JButton("Add Text");

        this.setLayout(new FlowLayout());

        this.add(textArea);
        this.add(button);

        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            //System.out.println(textArea.getText());             //print text that write on box
            //System.out.println(textArea.getSelectedText());     //print selected text
            //textArea.append(" Hi Chathura ");                   //append text
            //System.out.println(textArea.getCaretPosition());
            textArea.insert(" Hello Chathura ",textArea.getCaretPosition());

        }

    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Text Area");
        frame.setSize(420, 420);
        frame.getContentPane().setBackground(new Color(126, 214, 255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}