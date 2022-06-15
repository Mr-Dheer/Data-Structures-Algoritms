package GUI;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class haha  implements ActionListener {
    JButton button;
    JTextField textfield;
    JFrame frame;
    public haha(){

        frame=new JFrame();

            frame.setSize(1000,800);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);

        JLabel label=new JLabel("Enter Name");

            frame.add(label);
            label.setBounds(200,100,200,60);

        textfield=new JTextField();
                frame.add(textfield);
                textfield.setBounds(300,100,300,80);


        button=new JButton("LOGIN");

            frame.add(button);
            button.addActionListener(this);

            button.setBounds(200,200,150,50);
    }

    public static void main(String[] args) {
        haha obj=new haha();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            String name=textfield.getText();

//            System.out.println(name);

            textfield.setText("");

            if (name.equals("")){
                JOptionPane.showMessageDialog(frame,"Please enter something");

            }
            else
            {
                JOptionPane.showMessageDialog(frame,name);

            }
        }



    }
}
