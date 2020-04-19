import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateProfileGUI {
    private JFrame mainFrame, secondFrame;
    private JLabel lb1, lb2, lb3, lb4, lb5;
    private JButton btn, btn2;
    private JTextField textField1, textField2;
    private JComboBox jComboBox;

    public UpdateProfileGUI() {
        prepareGUI();
    }
    private void prepareGUI() {
        mainFrame = new JFrame("Update Profile");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(null);
        lb1 = new JLabel("Update Profile");
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
        btn = new JButton("Find");
        btn.setBounds(120, 210, 100, 20);
        mainFrame.add(btn);
        lb4 = new JLabel("Update Field: ");
        lb4.setBounds(100, 160, 100, 20);
        mainFrame.add(lb4);
        String list[] = {"Address", "Phone", "Trip Cost", "Travel Type", "Payment Type", "Mode of Travel", "Med Contact", "Med Phone", "Allergy Type", "Illness Type"};
        jComboBox = new JComboBox(list);
        jComboBox.setBounds(180, 160, 100, 20);
        mainFrame.add(jComboBox);
        mainFrame.setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondFrame.setVisible(true);
            }
        });
    };

    public static void main(String[] args) {
        UpdateProfileGUI updateprofile = new UpdateProfileGUI();
    }
}
