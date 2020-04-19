import javax.swing.*;

public class DeleteProfileGUI {
    private JFrame mainFrame;
    private JLabel lb1, lb2, lb3;
    private JPanel panel;
    private JButton btn;
    private JTextField textField1, textField2;

    public DeleteProfileGUI() {
        prepareGUI();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Delete Profile");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(null);
        lb1 = new JLabel("Delete Profile");
        lb1.setBounds(120, 60, 100, 20);
        mainFrame.add(lb1);
        lb2 = new JLabel("Traveler ID: ");
        lb2.setBounds(100, 100, 150, 20);
        mainFrame.add(lb2);
        textField1 = new JTextField();
        textField1.setBounds(180, 100, 150, 20);
        mainFrame.add(textField1);
        lb3 = new JLabel("Last Name: ");
        lb3.setBounds(100, 130, 150, 20);
        mainFrame.add(lb3);
        textField2 = new JTextField();
        textField2.setBounds(180, 130, 150, 20);
        mainFrame.add(textField2);
        btn = new JButton("Delete");
        btn.setBounds(120, 160, 100, 20);
        mainFrame.add(btn);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args) {
        DeleteProfileGUI deleteprofile = new DeleteProfileGUI();
    }
}
