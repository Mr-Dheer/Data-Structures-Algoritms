package TIC_TAC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game_2 implements ActionListener {

    JFrame frame;
    JButton[] button;
    int count = 0;
    String str;
    boolean win = false;

    public Game_2() {

        frame = new JFrame("ZERO KATTA");

        frame.setSize(900, 800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3, 3));

        button = new JButton[10];

        for (int i = 1; i <= 9; i++) {

            button[i] = new JButton();
            frame.add(button[i]);
            button[i].addActionListener(this);

        }
    }


    public static void main(String[] args) {
        Game_2 obj = new Game_2();
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
                button[i].setText(str);
                button[i].setEnabled(false);
                button[i].setFont(new Font("Arial", 1, 70));
                button[i].setBackground(Color.orange);
            }

        }
        winnerPossibilities();
        whoWins();

    }


    public void restartGame() {

        int i = JOptionPane.showConfirmDialog(frame, "Do you wanna play again ? :)");

        if (i == 0) {
            count = 0;
            str = "";
            win = false;

            for (int j = 1; j <= 9; j++) {

                button[j].setText("");
                button[j].setEnabled(true);
                button[j].setBackground(Color.orange);
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
            JOptionPane.showMessageDialog(frame, str + "  WINS");
            restartGame();


        } else if (win == false && count == 9) {
            JOptionPane.showMessageDialog(frame, "MATCH TIE");
            restartGame();


        }
    }


    //       Win Possibilities
    public void winnerPossibilities() {


//        ROW WISE


        if (button[1].getText() == button[2].getText() && button[2].getText() == button[3].getText() && button[1].getText() != "") {

            win = true;
        } else if (button[4].getText() == button[5].getText() && button[5].getText() == button[6].getText() && button[4].getText() != "") {
            win = true;

        } else if (button[7].getText() == button[8].getText() && button[8].getText() == button[9].getText() && button[8].getText() != "") {
            win = true;

        }

//        HORIZONTAL WISE

        else if (button[1].getText() == button[4].getText() && button[4].getText() == button[7].getText() && button[1].getText() != "") {
            win = true;

        } else if (button[2].getText() == button[5].getText() && button[5].getText() == button[8].getText() && button[2].getText() != "") {
            win = true;

        } else if (button[3].getText() == button[6].getText() && button[6].getText() == button[9].getText() && button[3].getText() != "") {
            win = true;

        }

//        DIAGONALLY

        else if (button[3].getText() == button[5].getText() && button[5].getText() == button[7].getText() && button[3].getText() != "") {
            win = true;

        } else if (button[1].getText() == button[5].getText() && button[5].getText() == button[9].getText() && button[1].getText() != "") {
            win = true;

        } else {
            win = false;

        }
    }
}





