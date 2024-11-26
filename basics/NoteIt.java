import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NoteItHome implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea textArea;

    NoteItHome() {
        // Apply a custom dark theme
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Failed to apply Look and Feel");
        }

        frame = new JFrame("NoteIt - Dark Theme");

        // Dark colors for UI components
        Color bgColor = new Color(45, 45, 45);  // Background color
        Color fgColor = new Color(230, 230, 230);  // Foreground text color
        Color accentColor = new Color(85, 85, 85);  // Accent color for menus

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");

        // Add action listeners
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        // Customize the menu bar and menus
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

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        // Customize the text area
        textArea = new JTextArea();
        textArea.setBackground(bgColor);
        textArea.setForeground(fgColor);
        textArea.setCaretColor(fgColor);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Frame settings
        frame.setJMenuBar(menuBar);
        frame.add(new JScrollPane(textArea));  // Add text area with scroll pane
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == cut) {
            textArea.cut();
        }
        if (event.getSource() == copy) {
            textArea.copy();
        }
        if (event.getSource() == paste) {
            textArea.paste();
        }
        if (event.getSource() == selectAll) {
            textArea.selectAll();
        }
    }
}

public class NoteIt {
    public static void main(String[] args) {
        new NoteItHome();
    }
}
