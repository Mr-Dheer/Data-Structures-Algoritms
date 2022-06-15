package TIC_TAC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;


    public Game(){


        frame=new JFrame("Tic Tac Toe G ame");

        frame.setSize(900,800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button1=new JButton();
        frame.add(button1);
        button1.setBounds(30,30,200,200);
        button1.addActionListener(this);

        button2=new JButton();
        frame.add(button2);
        button2.setBounds(340,30,200,200);
        button2.addActionListener(this);


        button3=new JButton();
        frame.add(button3);
        button3.setBounds(650,30,200,200);
        button3.addActionListener(this);



        button4=new JButton();
        frame.add(button4);
        button4.setBounds(30,300,200,200);
        button4.addActionListener(this);


        button5=new JButton();
        frame.add(button5);
        button5.setBounds(340,300,200,200);
        button5.addActionListener(this);



        button6=new JButton();
        frame.add(button6);
        button6.setBounds(650,300,200,200);
        button6.addActionListener(this);


        button7=new JButton();
        frame.add(button7);
        button7.setBounds(30,550,200,200);
        button7.addActionListener(this);


        button8=new JButton();
        frame.add(button8);
        button8.setBounds(340,550,200,200);
        button8.addActionListener(this);


        button9=new JButton();
        frame.add(button9);
        button9.setBounds(650,550,200,200);
        button9.addActionListener(this);


    }

    public static void main(String[] args) {
        Game obj=new Game();


    }

    @Override
    public void actionPerformed(ActionEvent e) {





        if (e.getSource() == button1) {

            button1.setText("X");
        }
        if (e.getSource() == button2) {

            button1.setText("X");
        }
        if (e.getSource() == button2) {

            button1.setText("X");
        }
        if (e.getSource() == button3) {

            button1.setText("X");
        }
        if (e.getSource() == button4) {

            button1.setText("X");
        }
        if (e.getSource() == button1) {

            button1.setText("X");
        }
        if (e.getSource() == button1) {

            button1.setText("X");
        }
        if (e.getSource() == button1) {

            button1.setText("X");
        }
        if (e.getSource() == button1) {

            button1.setText("X");
        }



    }
}
