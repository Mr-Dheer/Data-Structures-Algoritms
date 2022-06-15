package TIC_TAC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice implements ActionListener {

    public void restartGame() {
        int i = JOptionPane.showConfirmDialog(frame, "Do you wanna play again Buddy ? :)  ");


        if (i == 0) {
            count = 0;
            str = "";
            win = false;

            for (int j = 1; j <= 9; j++) {

                button[j].setText("");
                button[j].setEnabled(true);
            }

        } else if (i == 1) {
            System.exit(0);
        } else {
            for (int k = 1; k <= 9; k++) {

                button[k].setEnabled(false);

            }
        }
    }

    public void whoWins() {
        if (win == true) {
            JOptionPane.showMessageDialog(frame, str + "  Wins Baby");
            restartGame();
        } else if (win == false && count == 9) {

            JOptionPane.showMessageDialog(frame, str + "  MATCH TIE");
            restartGame();
        }

    }

    public void winPossibilities() {

        if (button[1].getText() == button[2].getText() && button[2].getText() == button[3].getText() && button[1].getText() != "") {

            win = true;

        } else if (button[4].getText() == button[5].getText() && button[5].getText() == button[6].getText() && button[6].getText() != "") {

            win = true;


//            JOptionPane.showMessageDialog("");
        } else if (button[7].getText() == button[8].getText() && button[8].getText() == button[9].getText() && button[9].getText() != "") {

            win = true;


//            JOptionPane.showMessageDialog("");
        } else if (button[1].getText() == button[4].getText() && button[4].getText() == button[7].getText() && button[7].getText() != "") {

            win = true;

//            JOptionPane.showMessageDialog("");
        } else if (button[2].getText() == button[5].getText() && button[5].getText() == button[8].getText() && button[8].getText() != "") {


            win = true;

//            JOptionPane.showMessageDialog("");

        } else if (button[3].getText() == button[6].getText() && button[6].getText() == button[9].getText() && button[9].getText() != "") {

            win = true;

//            JOptionPane.showMessageDialog("");
        } else if (button[1].getText() == button[5].getText() && button[5].getText() == button[9].getText() && button[9].getText() != "") {

            win = true;
        } else if (button[3].getText() == button[5].getText() && button[5].getText() == button[7].getText() && button[7].getText() != "") {

            win = true;
        } else {

            win = false;
        }
    }

    JFrame frame;
    JButton[] button;
    int count = 0;
    String str;
    boolean win = false;

    public practice() {
        frame = new JFrame();

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(3, 3));
        frame.setVisible(true);

        button = new JButton[10];

        for (int i = 1; i <= 9; i++) {

            button[i] = new JButton();
            frame.add(button[i]);
            button[i].addActionListener(this);
        }
    }

    public static void main(String[] args) {
        practice obj = new practice();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count = count + 1;
        if (count % 2 == 0) {
            str = "X";
        } else {
            str = "O";
        }

        for (int i = 1; i <= 9; i++) {

            if (e.getSource() == button[i]) {

                button[i].setEnabled(false);
                button[i].setText(str);
            }
        }
        winPossibilities();
        whoWins();
    }
}
