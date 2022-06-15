package NOTEPAD_PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice implements ActionListener {
    JMenuBar menubar;
    JMenu file, edit, format;
    JMenuItem neww, open, saveAs, cut, copy, paste, fontBackground, font, fontColor;
    JTextArea textArea;
    JFrame jf;
    JComboBox size, style, fontFamily;
    JFrame fontFrame;
    JButton OK;


    public Practice() {

        jf = new JFrame("*Untitled* Document");

        jf.setSize(1200, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);


        menubar = new JMenuBar();

        file = new JMenu("File");
        menubar.add(file);


        neww = new JMenuItem("New");
        neww.addActionListener(this);
        file.add(neww);

        open = new JMenuItem("Open");
        open.addActionListener(this);
        file.add(open);

        saveAs = new JMenuItem("Save As..");
        saveAs.addActionListener(this);
        file.add(saveAs);


        edit = new JMenu("Edit");

        cut = new JMenuItem("Cut");
        edit.add(cut);
        cut.addActionListener(this);

        copy = new JMenuItem("Copy");
        edit.add(copy);
        copy.addActionListener(this);

        paste = new JMenuItem("Paste");
        edit.add(paste);
        paste.addActionListener(this);


        menubar.add(edit);


        format = new JMenu("Format");
        menubar.add(format);

        font = new JMenuItem("Font");
        format.add(font);
        font.addActionListener(this);

        fontBackground = new JMenuItem("Background");
        format.add(fontBackground);
        fontBackground.addActionListener(this);

        fontColor = new JMenuItem("Font Color");
        format.add(fontColor);
        fontColor.addActionListener(this);


        jf.setJMenuBar(menubar);


        textArea = new JTextArea();

        jf.add(textArea);


        jf.setVisible(true);

    }

    public static void main(String[] args) {

        Practice obj = new Practice();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == neww) {

            newFile();


        }

        if (e.getSource() == open) {

            openFile();

        }

        if (e.getSource() == saveAs) {
            saveFile();
        }


        if (e.getSource() == cut) {

            textArea.cut();
        }

        if (e.getSource() == copy) {

            textArea.copy();
        }

        if (e.getSource() == paste) {

            textArea.paste();
        }

        if (e.getSource() == font) {

            fontFrame = new JFrame();

            fontFrame.setVisible(true);
            fontFrame.setSize(500, 500);
            fontFrame.setLayout(null);
            fontFrame.setLocationRelativeTo(jf);

            String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            fontFamily = new JComboBox(fonts);
            fontFamily.setBounds(50, 100, 100, 30);
            fontFrame.add(fontFamily);


            String[] SIZE = {"10", "20", "30", "40", "50", "60", "70", "80", "90"};
            size = new JComboBox(SIZE);
            size.setBounds(300, 100, 100, 30);
            fontFrame.add(size);

            String[] STYLE = {"Plain", "Italic", "Bold"};
            style = new JComboBox(STYLE);
            style.setBounds(170, 100, 100, 30);
            fontFrame.add(style);

            OK = new JButton("OK");
            OK.setBounds(180, 200, 100, 50);
            fontFrame.add(OK);
            OK.addActionListener(this);

        }

        if (e.getSource() == OK) {

            String font_family = (String) fontFamily.getSelectedItem();
            String font_style = (String) style.getSelectedItem();
            String font_size = (String) size.getSelectedItem();

            Font ff = new Font(font_family, 0, Integer.parseInt(font_size));
            textArea.setFont(ff);

            fontFrame.setVisible(false);


        }
        if (e.getSource() == fontColor) {

            Color c = JColorChooser.showDialog(jf, "Choose Color", Color.white);
            textArea.setForeground(c);


        }

        if (e.getSource() == fontBackground) {

            Color c = JColorChooser.showDialog(jf, "Choose Poop", Color.white);
            textArea.setBackground(c);


        }

    }


    public void newFile() {


        String text = textArea.getText();

        if (!text.equals("")) {

            int i = JOptionPane.showConfirmDialog(jf, "Do you wanna save this bruh (^:^)");

            if (i == 0) {
                saveFile();
                textArea.setText("");
            } else if (i == 1) {
                textArea.setText("");
            }
        }


    }

    public void openFile() {

        JFileChooser filechoose = new JFileChooser();

        int result = filechoose.showSaveDialog(jf);

        if (result == 0) {

            File file = filechoose.getSelectedFile();
            textArea.setText("");
            jf.setTitle(file.getName());

            try (FileInputStream fis = new FileInputStream(file)) {

                int i;

                while ((i = fis.read()) != -1) {

                    textArea.append(String.valueOf((char) i));

                }

            } catch (IOException ee) {

                ee.printStackTrace();


            }

        }

    }

    public void saveFile() {
        JFileChooser filechoose = new JFileChooser();

        int result = filechoose.showSaveDialog(jf);

        if (result == 0) {

            String text = textArea.getText();
            File file = filechoose.getSelectedFile();

            jf.setTitle(file.getName());

            try (FileOutputStream fos = new FileOutputStream(file)) {

                byte b[] = text.getBytes();

                fos.write(b);


            } catch (IOException xe) {

                xe.printStackTrace();

            }


        }
    }

    public void fileOpen() {

    }

}



