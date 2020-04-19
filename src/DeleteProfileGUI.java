import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteProfileGUI {
    private JFrame mainFrame, secondFrame;
    private JLabel lb1, lb2, lb3, lb4, lb5;
    private JPanel panel;
    private JButton btn, btn2;
    private JTextField textField1, textField2;

    public DeleteProfileGUI() {
        prepareGUI();
    }
    private void prepareGUI() {
        mainFrame = new JFrame("Delete Profile");
        mainFrame.setSize(400, 400);
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
        secondFrame = new JFrame("Delete Profile");
        secondFrame.setSize(400, 400);
        secondFrame.setLayout(null);
        lb4 = new JLabel("Delete Profile");
        lb4.setBounds(120, 60, 100, 20);
        secondFrame.add(lb4);
        lb5 = new JLabel("Profile Deleted!");
        lb5.setBounds(120, 100, 100, 20);
        secondFrame.add(lb5);
        btn2 = new JButton("OK");
        btn2.setBounds(120, 140, 100, 20);
        secondFrame.add(btn2);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondFrame.setVisible(true);
            }
        });
    };

    public static void main(String[] args) {
        DeleteProfileGUI deleteprofile = new DeleteProfileGUI();
    }
}
