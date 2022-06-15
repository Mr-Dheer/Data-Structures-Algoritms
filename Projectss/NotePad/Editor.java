package NOTEPAD_PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Editor implements ActionListener {

    JMenuItem neww, open, saveAs, window, save, cut, copy, paste, font, fontColor, fontBackground;
    JFrame jf, fontFrame;
    JTextArea textArea;
    File file;
    JComboBox fontSize, fontFamily, fontStyle;
    JButton ok;


    public Editor() {


        jf = new JFrame("*Untitled*- Notepad++");

        jf.setSize(800, 700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");

        neww = new JMenuItem("New");
        file.add(neww);
        neww.addActionListener(this);

        window = new JMenuItem("New Window");
        file.add(window);
        window.addActionListener(this);

        open = new JMenuItem("Open");
        file.add(open);
        open.addActionListener(this);

        save = new JMenuItem("Save");
        file.add(save);
        save.addActionListener(this);

        saveAs = new JMenuItem("Save As...");
        file.add(saveAs);
        saveAs.addActionListener(this);


        menuBar.add(file);


        JMenu edit = new JMenu("Edit");

        cut = new JMenuItem("Cut");
        cut.addActionListener(this);
        edit.add(cut);

        copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        edit.add(copy);


        paste = new JMenuItem("Paste");
        paste.addActionListener(this);
        edit.add(paste);

        menuBar.add(edit);


        JMenu format = new JMenu("Format");
        menuBar.add(format);

        font = new JMenuItem("Font");
        format.add(font);
        font.addActionListener(this);

        fontColor = new JMenuItem("Font-Color");
        fontColor.addActionListener(this);
        format.add(fontColor);

        fontBackground = new JMenuItem("Font-Background");
        format.add(fontBackground);
        fontBackground.addActionListener(this);


        JMenu view = new JMenu("View");
        menuBar.add(view);

        JMenu help = new JMenu("Help");
        menuBar.add(help);


        jf.setJMenuBar(menuBar);


        textArea = new JTextArea();

//        Color c=JColorChooser.showDialog(jf,"choose ",Color.white);
        textArea.setBackground(Color.GRAY);


        JScrollPane pane = new JScrollPane(textArea);

        pane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        jf.add(pane);


        jf.setVisible(true);

    }

    public static void main(String[] args) {


        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ignored) {

            ignored.printStackTrace();

        }


        Editor obj = new Editor();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == neww) {

            newFile();

        }

        if (e.getSource() == save) {

            save();

        }


        if (e.getSource() == saveAs) {

            saveAs();
        }


        if (e.getSource() == open) {

            open();
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

            font();
        }


        if (e.getSource() == ok) {

            OK();
        }


        if (e.getSource() == fontBackground) {

            Color c = JColorChooser.showDialog(jf, "Choose Color", Color.white);
            textArea.setBackground(c);



        }

        if (e.getSource() == fontColor) {

            Color c = JColorChooser.showDialog(jf, "Choose color", Color.blue);
            textArea.setForeground(c);


        }


    }


    public void font() {

        fontFrame = new JFrame();

        fontFrame.setSize(500, 500);
        fontFrame.setVisible(true);
        fontFrame.setLocationRelativeTo(jf);
        fontFrame.setLayout(null);

        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontFamily = new JComboBox(fonts);
        fontFamily.setBounds(50, 100, 100, 30);
        fontFrame.add(fontFamily);

        String[] style = {"Plain", "Italic", "Bold"};
        fontStyle = new JComboBox(style);
        fontStyle.setBounds(170, 100, 100, 30);
        fontFrame.add(fontStyle);


        String[] size = {"10", "12", "14", "18", "24", "28", "32"};
        fontSize = new JComboBox(size);
        fontSize.setBounds(300, 100, 100, 30);
        fontFrame.add(fontSize);

        ok = new JButton("OK :)");
        ok.setBounds(180, 200, 100, 50);
        fontFrame.add(ok);
        ok.addActionListener(this);


    }

    public void OK() {
        String font_family = (String) fontFamily.getSelectedItem();
        String font_size = (String) fontSize.getSelectedItem();
        String font_style = (String) fontStyle.getSelectedItem();

        int fontInt = 0;
        if (font_style.equals("Plain")) {

            fontInt = 0;
        } else if (font_style.equals("Bold")) {

            fontInt = 1;
        } else if (fontStyle.equals("Italic")) {

            fontInt = 2;
        }

        Font ff = new Font(font_family, fontInt, Integer.parseInt(font_size));
        textArea.setFont(ff);

        fontFrame.setVisible(false);


    }


    public void open() {

        JFileChooser fileChooser = new JFileChooser();


        int result = fileChooser.showSaveDialog(jf);

        if (result == 0) {
            File file = fileChooser.getSelectedFile();
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

    public void save() {

        String title = jf.getTitle();

        if (title.equals("*Untitled*- Notepad++")) {

            saveAs();
        } else {

            try (FileOutputStream fos = new FileOutputStream(file)) {

                String text = textArea.getText();
                byte[] b = text.getBytes();
                fos.write(b);

            } catch (IOException tt) {
                tt.printStackTrace();
            }
        }
    }

    public void saveAs() {

        JFileChooser fileChooser = new JFileChooser();

        int result = fileChooser.showSaveDialog(jf);

        if (result == 0) {

            file = fileChooser.getSelectedFile();
            jf.setTitle(file.getName());

            try (FileOutputStream fos = new FileOutputStream(file)) {

                String text = textArea.getText();

                byte[] b = text.getBytes();

                fos.write(b);


            } catch (IOException e) {

                e.printStackTrace();
            }


        }


    }

    public void newFile() {
        String text = textArea.getText();

        if (!text.equals("")) {

            int i = JOptionPane.showConfirmDialog(jf, "Do you wanna save this file buddy :)");

            if (i == 0) {

                saveAs();
            } else if (i == 1) {

                textArea.setText("");
            }


        }
    }


}



