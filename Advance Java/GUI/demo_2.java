package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo_2 implements ActionListener {

   JButton obj4;
   JTextField obj3;
    JFrame obj;

    public demo_2() {
        obj = new JFrame();

            obj.setSize(800, 600);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.setLocationRelativeTo(null);
            obj.setLayout(null);

        JLabel obj2=new JLabel("Enter name :-");

            obj.add(obj2);
            obj2.setBounds(100,50,100,30);


        obj3=new JTextField();

            obj.add(obj3);
            obj3.setBounds(220,50,300,40);


        obj4=new JButton("LOGIN");

            obj.add(obj4);
            obj4.addActionListener(this);

            obj4.setBounds(200,200,150,50);

    }


    public static void main(String[] args) {

        new demo_2();

    }
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==obj4){

            String name=obj3.getText();

            if (name.equals("")) {

                JOptionPane.showMessageDialog(obj,"Enter name");

            }
            else
            {
                JOptionPane.showMessageDialog(obj,name);

                obj3.setText("");

            }




        }

    }
}