import java.awt.*;
import javax.swing.*;
public class UI {
    public static void main(String[] args){
        Frame frame = new Frame("AWT Frame");
        JFrame jframe = new JFrame("Swing Frame");
//        frame.setSize(400, 400);
        jframe.setSize(400, 400);
        jframe.setVisible(true);
        jframe.setLayout(new FlowLayout());

        //Label
        JLabel jlabel = new JLabel("Provide your details: ");
        jframe.add(jlabel);

        //TextField
        JTextField jTextField = new JTextField(20);
        jframe.add(jTextField);
        jTextField.setBounds(200,200,200,50);

        //Button
        JButton jbutton = new JButton("Click ME!");
        jbutton.setBounds(300, 200, 100, 100);
        jframe.add(jbutton);

        //ComboBox
        String[] options = { "Option 1", "Option 2", "Option 3" };
        JComboBox<String> jcombobox = new JComboBox<>(options);
        jframe.add(jcombobox);

        //CheckBox
        JCheckBox jCheckBox = new JCheckBox("Accept terms & conditions");
        jframe.add(jCheckBox);

        //RadioButton
        JRadioButton jRadioButton = new JRadioButton("Male");
        jframe.add(jRadioButton);

        //JOptionPane
        JOptionPane.showConfirmDialog(null,  "Hello there");
    }
}