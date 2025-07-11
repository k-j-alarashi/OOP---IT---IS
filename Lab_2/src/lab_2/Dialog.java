package lab_2;

import javax.swing.JOptionPane;

public class Dialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name ? ");
        JOptionPane.showMessageDialog(null, name);
    }
}
