import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class NoteItHome implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit, help;
    JMenuItem newFile, openFile, saveFile, cut, copy, paste, selectAll, aboutNoteIt;
    JTextArea textArea;

    NoteItHome() {
        frame = new JFrame("NoteIt");

        //theme data
        Color bgColor = new Color(45, 45, 45);
        Color fgColor = new Color(230, 230, 230);
        Color accentColor = new Color(85, 85, 85);

        //File menu items
        newFile = new JMenuItem("New File");
        openFile = new JMenuItem("Open File");
        saveFile = new JMenuItem("Save File");

        //edit menu items
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");

        aboutNoteIt = new JMenuItem("About");

        //listeners for file menu items
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);

        //listeners for edit menu items
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        aboutNoteIt.addActionListener(this);

        //creating and assigning theme data to menubar
        menuBar = new JMenuBar();
        menuBar.setBackground(accentColor);
        menuBar.setForeground(fgColor);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        for (JMenu menu : new JMenu[]{file, edit, help}) {
            menu.setForeground(fgColor);
            menu.setBackground(accentColor);
        }

        //add file menu items
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);

        //add edit menu items
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        help.add(aboutNoteIt);

        menuBar.add(file);
        menuBar.setForeground(fgColor);
        menuBar.setBackground(accentColor);
        menuBar.add(edit);
        menuBar.add(help);

        textArea = new JTextArea();
        textArea.setBackground(bgColor);
        textArea.setForeground(fgColor);
        textArea.setCaretColor(fgColor);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.setJMenuBar(menuBar);
        frame.add(new JScrollPane(textArea));
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == cut) {
            textArea.cut();
        } else if (event.getSource() == copy) {
            textArea.copy();
        } else if (event.getSource() == paste) {
            textArea.paste();
        } else if (event.getSource() == selectAll) {
            textArea.selectAll();
        } else if (event.getSource() == newFile) {
            textArea.setText("");
        } else if (event.getSource() == openFile) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    textArea.read(reader, null);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(frame, "Error opening file!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (event.getSource() == saveFile) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    textArea.write(writer);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(frame, "Error saving file!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if (event.getSource() == aboutNoteIt) {
            String message = "NoteIt is a text editor,\nMade by Yogesh Bateshar(240010120046).";
            String title = "About NoteIt";
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        }

    }
}

public class NoteIt {
    public static void main(String[] args) {
        new NoteItHome();
    }
}